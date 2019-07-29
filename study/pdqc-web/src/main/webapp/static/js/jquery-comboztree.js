/**
 * 基于zTree的下拉树组件.
 * 
 * 使用方法:
 * 
 * <pre>
 * // 初始化
 * $(selector).ComboZTree({});
 * // 设值
 * $(selector).ComboZTree('setValue', '');
 * // 获取值
 * var val = $(selector).ComboZTree('getValue');
 * // 获取文本
 * var text = $(selector).ComboZTree('getText');
 * // 设定可用性
 * $(selector).ComboZTree('setDisabled', true);
 * // 判断可用性
 * var isDisabled = $(selector).ComboZTree('isDisabled');
 * </pre>
 * 
 * @author kxiong
 * @version 1.0.0
 */
;
!(function($, window, doucument) {
    // 常量定义
    var Const = {
        /* 实例的保存属性 */
        DATA_INSTANCE : 'ComboZTree.instance',
        /* 公开的函数 */
        EXPOSE_METHODS : ['setValue', 'getValue', 'setDisabled', 'isDisabled', 'getText']
    };

    // 下拉选择树类
    function ComboZTree(dom, options) {
        // 配置项
        this.options = options;
        // 顶层容器
        this.$dom = $(dom);
        // 文本输入框
        this.$text = null;
        // 值隐藏框
        this.$value = null;
        // 下拉按钮
        this.$btnDrop = null;
        // 下拉容器
        this.$dropMenu = null;
        // ZTree节点
        this.$ztreeUl = null;
        // ZTree对象
        this.ztree = null;
        // 过滤器对象
        this.$filter = null;

        // 阻止关闭的标记
        this.stopCloseFlag = true;
    }

    // 初期化函数
    ComboZTree.prototype.init = function() {
        // 初始化基本UI元素
        this.initUI();
        // 初始化事件
        this.initEvent();
        // 初始化ZTree
        this.initZtree();
    }

    // 重设下拉菜单的宽度
    ComboZTree.prototype.resetMenuWidth = function() {
        // 内部菜单与对象本身保持一直
        this.$dropMenu.width(this.$dom.width());
    }

    // 初始化基本UI元素
    ComboZTree.prototype.initUI = function() {
        // 为当前元素添加'rythm-comboztree'样式（如果）
        if (!this.$dom.hasClass("rythm-comboztree")) {
            $dom.addClass("rythm-comboztree");
        }
        // 文本输入框容器
        this.$text = this.$dom.find('input[type=text].form-control').first();
        // 值隐藏域
        this.$value = this.$dom.find('input[type=hidden]').first();
        // 下拉按钮
        this.$btnDrop = this.$dom.find('button').first();
        // 下拉容器
        this.$dropMenu = this.$dom.find('div.dropdown-menu').first();
        // ZTree节点
        this.$ztreeUl = this.$dropMenu.find('ul.ztree').first();
        // 过滤器
        this.$filter = this.$dropMenu.find('.filter input').first();
        // 如果不可用
        if (this.options.disabled) {
            this.setDisabled(true);
        }
    }

    // 清空过滤器框
    ComboZTree.prototype.clearFilter = function() {
        if (this.$filter.length > 0) {
            // 当前值
            var oldVal = this.$filter.val();
            // 过滤值设为空
            this.$filter.val('');
            // 如果前值不为空
            if (oldVal != '') {
                // 触发事件
                this.$filter.trigger('input');
            }
        }
    }

    function fnExportNodeAndParent(node, exportNodes) {
        if (node == null) {
            return;
        }
        // 将当前节点放到目标对象
        exportNodes.push(node);
        // 将当前节点的父节点也放到目标对象
        fnExportNodeAndParent(node.getParentNode(), exportNodes);
    }

    // 初始化事件
    ComboZTree.prototype.initEvent = function() {
        var that = this;
        // 下拉框的点击事件
        this.$dom.find(".dropdown-menu").click(function(event) {
            // 如果是阻止下拉框关闭
            if (that.stopCloseFlag) {
                return false;
            }
            // 恢复阻止
            that.stopCloseFlag = true;
            return true;
        });
        this.$text.click(function(e) {
            if ($(this).is('.disabled, :disabled'))
                return
            e.stopPropagation();
            $(that.$btnDrop).dropdown('toggle');
        });
        this.$btnDrop.parent().on('show.bs.dropdown', function() {
            // 清空过滤器内容
            that.clearFilter();
            // 计算宽度
            that.resetMenuWidth();
        });
        // 过滤器变化时间
        this.$filter.on("input propertychange", function() {
            // 获得过滤值
            var val = this.value;
            // 如果是空值
            if (val == '') {
                // 显示所有隐藏的节点
                that.ztree.showNodes(that.ztree.getNodesByParam("isHidden", true));
            } else {
                // 隐藏所有节点
                that.ztree.hideNodes(that.ztree.getNodesByParam("isHidden", false));
                // 查找所有符合条件的节点
                var fuzzyNodes = that.ztree.getNodesByParamFuzzy("name", val, null);
                var allNodes = [];
                // 输出所有节点和父节点
                for (var i = 0; i < fuzzyNodes.length; i++) {
                    fnExportNodeAndParent(fuzzyNodes[i], allNodes);
                }
                // 显示所有节点
                that.ztree.showNodes(allNodes);
            }
            // 返回true
            return true;
        })
        // 设定大小变更事件
        $(window).resize(function() {
            // 可见的场合触发
            if (!that.$dropMenu.is(":hidden")) {
                // 计算宽度
                that.resetMenuWidth();
            }
        });
    }

    // 将选中的节点应用到文本和值域中
    ComboZTree.prototype.applySelectedNodes = function() {
        // 值数组
        var valueArray = [];
        // 文本数组
        var textArray = [];
        // 获得所有被选中的节点
        var nodeArray = this.ztree.getCheckedNodes(true) || [];
        // 选中对象
        for (var i = 0; i < nodeArray.length; i++) {
            // 如果是叶子节点,或者允许选中父节点
            if (!nodeArray[i].isParent || this.options.pnodeSelectable) {
                // 选中对象
                this.ztree.checkNode(nodeArray[i], true);
                // 拼接值域
                valueArray.push(nodeArray[i].id);
                // 拼接文本域
                textArray.push(nodeArray[i].name);
            }
        }
        // 设定值
        this.$value.val(valueArray.join(','));
        // 设定文本域
        this.$text.val(textArray.join(','));
        this.$text.trigger('change');
    }

    ComboZTree.prototype.isDisabled = function() {
        return this.$btnDrop.hasClass("disabled");
    }

    ComboZTree.prototype.setDisabled = function(disabled) {
        this.$btnDrop.attr("disabled", disabled);
        this.$text.attr("disabled", disabled);
    }

    ComboZTree.prototype.getText = function() {
        return this.$text.val();
    }

    ComboZTree.prototype.getValue = function() {
        return this.$value.val();
    }

    ComboZTree.prototype.uncheckAllNodes = function() {
        // 获得所有被选中的节点
        var nodeArray = this.ztree.getCheckedNodes(true) || [];
        // 选中对象
        for (var i = 0; i < nodeArray.length; i++) {
            // 选中对象
            this.ztree.checkNode(nodeArray[i], false);
        }
    }
    ComboZTree.prototype.setValue = function(val) {
        // 值数组
        var valArray = [];
        // 如果是多选
        if (this.options.multiSelect) {
            // 通过逗号分割
            valArray = val.split(this.options.multiSeparator);
        } else {
            valArray.push(val);
        }
        // 取消所有的选中
        this.uncheckAllNodes();
        // 遍历值
        for (var i = 0; i < valArray.length; i++) {
            // 查找文本
            var node = this.ztree.getNodeByParam("id", valArray[i]);
            // 如果找到，则选中
            if (node != null) {
                this.ztree.checkNode(node, true, true);
            }
        }
        // 应用选中这些节点
        this.applySelectedNodes();
    }

    // 应用初期值
    ComboZTree.prototype.applyInitValue = function() {
        // 如果初期值存在
        if (this.options.initValue != null && this.options.initValue != "") {
            // 设定初期值
            this.setValue(this.options.initValue);
        }
        // 如果禁用
        if (this.options.disabled) {
            // 设定为不可用
            this.setDisabled(true);
        }
    }

    // 加载Ajax数据
    ComboZTree.prototype.loadAjaxData = function(ajaxResult) {
        var that = this;
        // 树组件的设定
        var setting = {
            check : {
                chkboxType : {
                    "Y" : "ps",
                    "N" : "ps"
                },
                enable : true,
                /* Check的类型 */
                chkStyle : that.options.multiSelect ? "checkbox" : "radio",
                /* radio时候的类型 */
                radioType : "all"
            },
            data : {
                // 使用简单数据类型
                simpleData : {
                    enable : true,
                    pIdKey : "pid"
                }
            },
            view : {
                showIcon : that.options.showIcon
            },
            callback : {
                /* Check事件 */
                onCheck : function() {
                    that.onTreeNodeCheck.apply(that, arguments);
                },
                /* 单击事件 */
                onClick : function() {
                    // 调用对象的点击事件
                    that.onTreeNodeClick.apply(that, arguments);
                },
                onDblClick : function() {
                    // 调用对象的双击事件
                    that.onTreeNodeDblClick.apply(that, arguments);
                }
            }
        };

        var treeData = ajaxResult;
        // 编辑数据
        if (typeof this.options.fnDataEditor === 'function') {
            treeData = this.options.fnDataEditor.call(this, ajaxResult);
        }
        // 初始化ZTree
        this.ztree = $.fn.zTree.init(this.$ztreeUl, setting, treeData);
        // 应用初期值
        this.applyInitValue();

        // 是否展开所有
        if (this.expandAll) {
            this.ztree.expandAll(true);
        }
    }

    // Check处理
    ComboZTree.prototype.onTreeNodeCheck = function(event, treeId, treeNode) {
        // 同步值域和文本域
        this.applySelectedNodes();
    }

    // 单击处理
    ComboZTree.prototype.onTreeNodeClick = function(event, treeId, treeNode, clickFlag) {
        // 如果是单选，而且是父节点+不允许选择父节点
        if (!this.options.multiSelect && (treeNode.isParent && !this.options.pnodeSelectable)) {
            // 直接返回
            return;
        }
        // 选中该节点，如果是多选则为切换选中状态(此处需要触发onCheck事件)
        this.ztree.checkNode(treeNode, (this.options.multiSelect) ? null : true, true, true);
        // 如果单选
        if (!this.options.multiSelect) {
            // 允许关闭下拉框
            this.stopCloseFlag = false;
        }
    }
    // 双击处理
    ComboZTree.prototype.onTreeNodeDblClick = function(event, treeId, treeNode, clickFlag) {

    }

    // 加载ZTree
    ComboZTree.prototype.initZtree = function() {
        var that = this;
        if ((that.options.ajaxUrl || "") != "") {
            // 请求的数据
            var ajaxParam = {};
            if (typeof that.options.ajaxParam === 'function') {
                ajaxParam = that.options.ajaxParam.call(that);
            } else {
                ajaxParam = that.options.ajaxParam;
            }
            // 请求树的数据
            $.ajax({
                /* 请求的URL */
                url : that.options.ajaxUrl,
                /* 请求参数 */
                data : ajaxParam,
                /* 缓存 */
                cache : false,
                /* 请求类型 */
                type : "get",
                /* 数据类型 */
                dataType : "json",
                /* 成功处理 */
                success : function(result) {
                    that.loadAjaxData.call(that, result);
                }
            });
        }
    }

    // jQuery访问
    $.fn.ComboZTree = function() {
        // 返回对象
        var retValue;
        // 获得参数名
        var arg0 = arguments[0];
        var ARG = arguments;
        // 如果参数是一个字符串
        if (typeof(arg0) == 'string') {
            // 如果不属于公开的函数
            if ($.inArray(arg0, Const.EXPOSE_METHODS) < 0) {
                $.error("UnSupport Method: " + arg0);
                return this;
            }
            // 函数的名字
            var methodName = arg0;
            // 需要返回的值
            var retVal;
            // 遍历每一个对象
            var chain = this.each(function() {
                // 对象
                var $this = $(this);
                // 获取对象
                var instance = $this.data(Const.DATA_INSTANCE);
                // 如果对象不存在
                if (!instance) {
                    $.error('Selector [' + $this.selector + '] is Not a ComboZTree Object or not be initiated！');
                    return;
                }
                // 调用函数
                retVal = instance[methodName].apply(instance, Array.prototype.slice.call(ARG, 1));
            });
            // 返回（如果没有返回值则返回this对象）
            return (typeof retVal !== 'undefined') ? retVal : chain;
        }
        // 如果参数是个对象，或者没有输入
        if (arg0 == undefined || typeof(arg0) === 'object') {

            return this.each(function() {
                // 对象
                var $this = $(this);
                // 获取对象
                var instance = $this.data(Const.DATA_INSTANCE);
                // 如果已经存在,则不需要初期化
                if (instance) {
                    return;
                }
                // 从data属性中获取配置属性
                var dataOptions = {}, dataSetting = $this.data();
                $.each(dataSetting, function(key) {
                    var attributeName = 'comboztree' + key.charAt(0).toUpperCase() + key.slice(1);
                    // 仅仅设定$.fn.ComboZTree.defaults中已经定义了的属性
                    if ($.fn.ComboZTree.defaults[attributeName] !== undefined) {
                        dataOptions[key] = dataSetting[attributeName];
                    }
                });
                // 创建实例
                instance = new ComboZTree(this, $.extend(true, {}, $.fn.ComboZTree.defaults, dataOptions, arg0));
                // 初期化
                instance.init();
                // 保存实例
                $this.data(Const.DATA_INSTANCE, instance);
            });
        }
        // 提示错误
        $.error('UnSupport Argument Type :' + typeof(arg0));
        return this;
    }

    // 默认设定
    $.fn.ComboZTree.defaults = {
        /* 是否多选(默认单选) */
        multiSelect : false,
        /* 多选值的分隔符 */
        multiSeparator : ",",
        /* 初期值(空) */
        initValue : "",
        /* 是否不可用 */
        disabled : false,
        /* 是否展开所有 */
        expandAll : true,
        /* 显示图标 */
        showIcon : false,
        /* Ajax请求地址 */
        ajaxUrl : "",
        /* 数据请求条件 */
        ajaxParam : {},
        /* 是否允许选中非叶子节点 */
        pnodeSelectable : false,
        /* 数据编辑 */
        fnDataEditor : function(data) {
            return data.data;
        }
    };
})(jQuery, window, document);
