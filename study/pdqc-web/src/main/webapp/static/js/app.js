;
/**
 * 画面共通JavaScript
 */
// 主体部分
var App = $(window);

// 消息定义
var Message = App.Message = {
    Ajax : {
        ErrUnKnown : "未知错误",
        Err401 : "登录超时",
        Err403 : "没有权限!",
        Err405 : "参数不正确",
        Err408 : "请求超时",
        ErrNetwork : "网络中断"
    }
};

// JS增强部分
!function($, window, doucument) {
    // String.prototype.replaceAll = function(s1, s2) {
    // return this.replace(new RegExp(s1, "gm"), s2);
    // }
}(jQuery, window, document);

// Context部分
var Context = App.Context = function($, window, doucument) {
    // 跳转到登录页面
    function fnRedirectToLogin() {
        window.location.href = CONTEXT_ROOT + "login";
    }
    // 返回公开的对象
    return {
        // 获得完整的路径
        getRootUrl : function() {
            return CONTEXT_ROOT;
        },
        // 当前的DialogID
        getDialogId : function() {
            return DIALOG_ID;
        },
        // 跳转到Login画面
        redirectToLogin : fnRedirectToLogin
    };
}(jQuery, window, document);

// Layout部分
var Layout = App.Layout = function($, window, doucument) {
    "use strict";
    // 判断当前是否全屏
    function fnIsFullScreen() {
        var isFs = window.fullScreen || (window.innerWidth == screen.width && window.innerHeight == screen.height);
        return isFs;
    }
    // 退出全屏模式
    function fnExitFullscreen() {
        var d = document;
        var fn = d.exitFullscreen || d.mozCancelFullScreen || d.webkitExitFullscreen || d.msExitFullscreen
                || function() {
                };
        fn.apply(d);
    }
    // 进入全屏模式
    function fnEnterFullscreen() {
        var d = document.documentElement;
        var fn = d.requestFullscreen || d.mozRequestFullScreen || d.webkitRequestFullScreen || d.msRequestFullscreen
                || function() {
                };
        fn.apply(d);
    }

    function fnToggleFullScreen() {
        // 如果是全屏模式
        if (fnIsFullScreen()) {
            // 退出全屏
            fnExitFullscreen();
        } else {
            // 进入全屏
            fnEnterFullscreen();
        }
    }

    // Layout相关的函数.
    return {
        // 切换全屏
        isFullScreen : fnIsFullScreen,
        exitFullscreen : fnExitFullscreen,
        enterFullscreen : fnEnterFullscreen,
        toggleFullScreen : fnToggleFullScreen
    };
}(jQuery, window, document);

// Ajax部分 与Ajax请求相关的函数
var Ajax = App.Ajax = function($, window, doucument) {
    "use strict";
    // AJAX错误处理函数
    function fnErrorHandler(xhr, status, error) {
        // 如果xhr为null
        if (!xhr) {
            // 提示未知错误
            App.MsgBox.error(App.Message.Ajax.ErrUnKnown);
            return;
        }
        // 如果HTTP请求出错
        if (typeof(xhr.status) == "number") {
            // 根据状态码进行处理
            switch (xhr.status) {
                // 未认证的时候
                case 401 :
                    // 提示未认证，并跳转到Login画面
                    App.MsgBox.warning(App.Message.Ajax.Err401, function() {
                        App.Context.redirectToLogin();
                    });
                    break;
                // 没有权限的时候
                case 403 :
                    App.MsgBox.warning(App.Message.Ajax.Err403);
                    break;
                // 不正Request的时候
                case 405 :
                    App.MsgBox.warning(App.Message.Ajax.Err405);
                    break;
                // 应答超时的时候
                case 408 :
                    App.MsgBox.warning(App.Message.Ajax.Err408);
                    break;
                // 其它错误
                default :
                    App.MsgBox.warning(App.Message.Ajax.ErrNetwork);
                    break;
            }
        } else {
            // 提示未知错误
            App.MsgBox.error(App.Message.Ajax.ErrUnKnown);
        }
    };

    // 呼叫回调函数
    function fnCallFn(fn, thisObj, args) {
        // 判断函数有效性
        if (typeof fn === 'function') {
            // 调用函数
            fn.apply(thisObj, args);
        }
    }

    // ajax
    function fnAjax(paramOptions) {
        // 有效属性
        var opt = $.extend({
            /* 缓存 */
            cache : false,
            /* 是否显示遮罩 */
            mask : true,
            /* 自动处理成功消息 */
            autoSuccess : true,
            /* 请求类型 */
            type : "get",
            /* 数据类型 */
            dataType : "json",
            /* 错误处理 */
            error : fnErrorHandler,
            /* 提交前处理 */
            beforeSend : function(xhr) {
                if (opt.mask) {
                    (parent.App || self.App).Dialog.showMask();
                }
            },
            complete : function(xhr, status) {
                if (opt.mask) {
                    (parent.App || self.App).Dialog.closeMask();
                }
            }
        }, paramOptions);

        // 重写成功处理函数
        opt.success = function(result, status, xhr) {
            var THIS = this;
            // 判断是否为标准返回（retCode，retMsg）
            if (result && result.hasOwnProperty('retCode') && result.hasOwnProperty('retMsg')) {
                // 自动处理消息，而且返回值不为0
                if (opt.autoSuccess && result.retCode != 0 ) {
                	if(result.retCode != 403){
                		(parent.App || self.App).MsgBox.error(result.retMsg, function() {
                            fnCallFn(paramOptions.success, THIS, [result, status, xhr]);
                        });
                    }else{
                    	MsgBox.warning(result.retMsg);
                    }
                } else {
                    fnCallFn(paramOptions.success, THIS, [result, status, xhr]);
                }
            } else {
                fnCallFn(paramOptions.success, THIS, [result, status, xhr]);
            }
        };
        return $.ajax(opt);
    }
    // Ajax相关的函数.
    return {
        // 切换全屏
        ajax : fnAjax
    };
}(jQuery, window, document);

// MsgBox部分 画面提示消息相关
var MsgBox = App.MsgBox = function($, window, doucument) {
    "use strict";
    function fnAlert(options, fnCallBack) {
        // 回调函数属性
        var DATA_CALLBACK = 'callback';
        // 有效属性
        var activeOpt = $.extend({
            /* 标题 */
            title : BootstrapDialog.DEFAULT_TEXTS[BootstrapDialog.TYPE_INFO],
            /* 消息 */
            message : null,
            /* 类型 */
            type : BootstrapDialog.TYPE_INFO,
            closable : false,
            closeByBackdrop : false,
            closeByKeyboard : false,
            size : BootstrapDialog.SIZE_NORMAL,
            animate : false,
            cssClass : 'dm-modal-sm modal-dialog-showPosition',
            /* OK按钮的标签 */
            buttonOKLabel : BootstrapDialog.DEFAULT_TEXTS['OK'],
            /* OK按钮的图标 */
            buttonOKIcon : "fa fa-check",
            /* OK按钮的CSS */
            buttonOKCssClass : "btn-primary"
        }, options);
        // 创建按钮
        activeOpt.buttons = [{
            /* 按钮文本 */
            label : activeOpt.buttonOKLabel,
            /* 按钮图标 */
            icon : activeOpt.buttonOKIcon,
            /* 按钮CSS */
            cssClass : activeOpt.buttonOKCssClass,
            /* 按钮动作 */
            action : function(dialog) {
                // 如果回调函数返回了false，则不关闭窗口.
                if (typeof dialog.getData(DATA_CALLBACK) === 'function'
                        && dialog.getData(DATA_CALLBACK).call(this, true) === false) {
                    return false;
                }
                return dialog.close();
            }
        }];
        // 创建Dialog
        var dialog = new BootstrapDialog(activeOpt);
        // 保存回调
        dialog.setData(DATA_CALLBACK, fnCallBack);
        // 打开窗口
        dialog.open();
    }

    // 警告信息
    function fnWarning(msg, fnCallBack) {
        fnAlert({
            title : BootstrapDialog.DEFAULT_TEXTS[BootstrapDialog.TYPE_WARNING],
            message : msg,
            type : BootstrapDialog.TYPE_WARNING,
            buttonOKCssClass : "btn-warning"
        }, fnCallBack);
    }

    // 成功信息
    function fnSuccess(msg, fnCallBack) {
        fnAlert({
            title : BootstrapDialog.DEFAULT_TEXTS[BootstrapDialog.TYPE_SUCCESS],
            message : msg,
            type : BootstrapDialog.TYPE_SUCCESS,
            buttonOKCssClass : "btn-success"
        }, fnCallBack);
    }

    // 提示信息
    function fnInfo(msg, fnCallBack) {
        fnAlert({
            title : BootstrapDialog.DEFAULT_TEXTS[BootstrapDialog.TYPE_INFO],
            message : msg,
            type : BootstrapDialog.TYPE_INFO,
            buttonOKCssClass : "btn-info"
        }, fnCallBack);
    }

    // 报错信息
    function fnError(msg, fnCallBack) {
        fnAlert({
            title : BootstrapDialog.DEFAULT_TEXTS[BootstrapDialog.TYPE_DANGER],
            message : msg,
            type : BootstrapDialog.TYPE_DANGER,
            buttonOKCssClass : "btn-danger"
        }, fnCallBack);
    }

    /**
     * 弹出确认消息框.
     */
    function fnConfirm(message, fnCallBack) {
        // 回调函数属性
        var DATA_CALLBACK = 'callback';
        // 创建按钮
        var buttons = [{
            /* 按钮文本 */
            label : BootstrapDialog.DEFAULT_TEXTS['CONFIRM'],
            /* 按钮CSS */
            cssClass : 'btn-primary',
            /* 按钮图标 */
            icon : "fa fa-check",
            /* 按钮动作 */
            action : function(dialog) {
                // 如果回调函数返回了false，则不关闭窗口.
                if (typeof dialog.getData(DATA_CALLBACK) === 'function'
                        && dialog.getData(DATA_CALLBACK).call(this, true) === false) {
                    return false;
                }
                return dialog.close();
            }
        }, {
            /* 按钮文本 */
            label : BootstrapDialog.DEFAULT_TEXTS['CANCEL'],
            /* 按钮CSS */
            cssClass : 'btn-default',
            /* 按钮图标 */
            icon : "fa fa-close",
            /* 按钮动作 */
            action : function(dialog) {
                // 如果回调函数返回了false，则不关闭窗口.
                if (typeof dialog.getData(DATA_CALLBACK) === 'function'
                        && dialog.getData(DATA_CALLBACK).call(this, false) === false) {
                    return false;
                }
                return dialog.close();
            }
        }];
        // 创建Dialog对象
        var dialog = new BootstrapDialog({
                    title : '确认',
                    message : message,
                    type : BootstrapDialog.TYPE_INFO,
                    closable : false,
                    closeByBackdrop : false,
                    closeByKeyboard : false,
                    animate : false,
                    cssClass : 'dm-modal-sm modal-dialog-showPosition',
                    buttons : buttons
                });
        // 保存回调
        dialog.setData(DATA_CALLBACK, fnCallBack);
        // 设定无法关闭
        dialog.setClosable(false);
        // 打开窗口
        dialog.open();
    }

    /**
     * 确认并且跳转.
     */
    function fnConfirmToUrl(message, url) {
        // 弹出确认框
        fnConfirm(message, function(result) {
            // 如果选择是
            if (result) {
                // 跳转
                window.location.href = url;
            }
        });
    }
    // MsgBox相关的函数.
    return {
        warning : fnWarning,
        success : fnSuccess,
        info : fnInfo,
        error : fnError,
        confirm : fnConfirm,
        confirmToUrl : fnConfirmToUrl
    };
}(jQuery, window, document);

// Dialog部分 弹出画面相关函数
var Dialog = App.Dialog = function($, window, doucument) {
    "use strict";
    // Dialog页面的id参数
    var PARAM_DIALOG_ID = "_DIALOG_ID";
    // 默认加载中的内容
    var LOADING_HTML = '<i class="fa fa-spinner fa-spin fa-fw"></i><span>加载中...</span>';

    // 默认的Mask窗口
    var MaskDialog = new BootstrapDialog({
                title : '',
                cssClass : 'ajax-waiting-dialog',
                animate : false,
                message : function(dialog) {
                    var htmlTmp = [];
                    htmlTmp.push('<div id="load-' + dialog.options.id + '" align="center" class="dialog-loading">');
                    htmlTmp.push('<i class="fa fa-spinner fa-spin fa-fw"></i><span>正在处理请求...</span>');
                    htmlTmp.push('</div>');
                    return htmlTmp.join('');
                },
                closable : false
            });

    // 显示一个Mask窗口
    function fnShowMask() {
        MaskDialog.open();
        var $modal = MaskDialog.getModal();
        var $backdrop = $modal.data('bs.modal').$backdrop;
        $modal.css('z-index', 9010);
        $backdrop.css('z-index', 9000);
    }
    // 关闭一个Mask窗口
    function fnCloseMask() {
        MaskDialog.close();
    }

    /**
     * 根据ID来关闭一个窗口.
     * 
     * @param dialogId 窗口ID
     */
    function fnClose(dialogId) {
        // 在本页面查找该Dialog的对象
        var dialog = BootstrapDialog.dialogs[dialogId];
        // 如果找到
        if (dialog) {
            // 关闭窗口
            dialog.close();
        }
    }
    // 获得IFRAME的模版
    function fnGetIframeTmp(dialogId, iframeUrl, iframeHeight, showLoadding) {
        var htmlTmp = [];
        if (showLoadding) {
            htmlTmp.push('<div id="load-' + dialogId + '" align="center" class="dialog-loading">');
            htmlTmp.push(LOADING_HTML);
            htmlTmp.push('</div>');
        }
        htmlTmp.push('<div style="-webkit-overflow-scrolling:touch;overflow-y:auto;-webkit-overflow:auto;height:' + (iframeHeight + 5) + 'px;">');
        htmlTmp.push('<iframe id="iframe-' + dialogId + '" name="iframe-' + dialogId + '" ');
        htmlTmp.push('   src="' + iframeUrl + '" ');
        htmlTmp.push('     style="display:none;width:100%;height:' + iframeHeight + 'px;border:none">');
        htmlTmp.push('</iframe>');
        htmlTmp.push('</div>');
        return htmlTmp.join('');
    }
    // 打开一个窗口
    function fnOpenIframeDialog(url, options) {
        // DialogID属性连接符
        var urlAttrDialogID = ((url.indexOf("?") != -1) ? "&" : "?") + PARAM_DIALOG_ID + "="
        // 默认的配置信息
        var config = {
            /* Iframe的高度 */
            iframeHeight : 300,
            /* 是否显示加载中 */
            bShowLoading : true,
            /* 是否显示加载中 */
            title : "",
            size : BootstrapDialog.SIZE_WIDE,
            closeByBackdrop : false,
            closeByKeyboard : false,
            animate : false,
            onshown : function(dialog) {
                // IFrame对象
                var iframe = $("#iframe-" + dialog.options.id);
                if (dialog.options.bShowLoading) {
                    // iFrame内容
                    var iframeUrl = url + urlAttrDialogID + dialog.options.id;
                    // 设定内容
                    iframe.attr("src", iframeUrl);
                    iframe.load(function() {
                        // 隐藏加载框
                        $("#load-" + dialog.options.id).hide();
                        iframe.show();
                    });
                } else {
                    iframe.show();
                }
            },
            onhide : function() {
                // 消除Iframe的内容
                $("#iframe-" + this.id).attr("src", "");
            },
            message : function(dialog) {
                if (dialog.options.bShowLoading) {
                    // 创建一个IFrame
                    return fnGetIframeTmp(dialog.options.id, "", dialog.options.iframeHeight, true);
                } else {
                    // iFrame内容
                    var iframeUrl = url + urlAttrDialogID + dialog.options.id;
                    // 创建一个IFrame
                    return fnGetIframeTmp(dialog.options.id, iframeUrl, dialog.options.iframeHeight, false);
                }
            }
        };
        // 覆盖
        $.extend(config, options);
        // 让Dialog高度自动
        config.height = "auto";
        config.cssClass = (config.cssClass || "") + " dialog-for-page";
        // 显示窗口
        BootstrapDialog.show(config);
    }

    // 对外公开的函数.
    return {
        // 关闭一个窗口
        close : fnClose,
        // 关闭自身
        closeSelf : function() {
        	//修改弹框关闭之后刷新父表格时，引起mask遮罩不关闭的问题 add by xiongke （caowenjun备注）
        	(parent.App || self.App).Dialog.closeMask();
        	//修改弹框关闭之后刷新父表格时，引起mask遮罩不关闭的问题 add by xiongke
            parent.Dialog.close(Context.getDialogId());
        },
        // 弹出一个窗口
        open : fnOpenIframeDialog,
        // 显示一个Mask窗口
        showMask : fnShowMask,
        // 关闭一个Mask窗口
        closeMask : fnCloseMask
    };
}(jQuery, window, document);

// BoostrapValidator验证相关
var BootstrapValidator = App.BootstrapValidator = function($, window, doucument) {
    // validator 默认属性
    $.fn.bootstrapValidator.DEFAULT_OPTIONS = $.extend($.fn.bootstrapValidator.DEFAULT_OPTIONS, {
        message : '值不合法',
        container : 'tooltip',
        feedbackIcons : {
            valid : 'fa fa-check',
            invalid : 'fa fa-times',
            validating : 'fa fa-refresh'
        }
    });
}(jQuery, window, document);

// 组件中心
var Widget = App.Widget = function($, window, doucument) {
    // 控件列表
    var _WidgetApiReg = [];
    // 默认组件属性
    var _WidgetDefaultApi = {
        className : "__UNSET__",
        selectWidget : function($parent) {
            return $parent.find("." + this.className);
        },
        // 是否是本组件
        isInstance : function($widget) {
            return $widget.hasClass(this.className);
        },
        // 是否禁用
        isDisabled : function($widget) {
            return $widget.prop("disabled");
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.prop("disabled", disabled);
        },
        // 设定值
        setValue : function($widget, val) {
            $widget.val(val);
        },
        // 清空值
        clearValue : function($widget) {
                $widget.val('');
        },
        // 获得值
        getValue : function($widget) {
            return $widget.val();
        },
        // 序列化
        serialize : function($widget, data) {
            var name = this.getName($widget);
            if (name && name != '') {
                data[name] = this.getValue($widget);
            }
        },
        // 获得文本
        getText : function($widget) {
            return this.getValue($widget);
        },
        // 获取名字
        getName : function($widget) {
            return $widget.attr("name");
        }
    };
    // 日期组件
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "rythm-datepicker",
        isDisabled : function($widget) {
            return $widget.find(".datepickerinput").prop('disabled');
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.datetimepicker(disabled ? 'disable' : 'enable');
        },
        // 设定值
        setValue : function($widget, val) {
            $widget.datetimepicker('date', val);
        },
        // 清空值
        clearValue : function($widget) {
                $widget.datetimepicker('clear');
        },
        // 获得值
        getValue : function($widget) {
            return $widget.find(".datepickerinput").val();
        },
        // 序列化
        serialize : function($widget, data) {
            var name = $widget.find(".datepickerinput").attr("name");
            if (name && name != '') {
                data[name] = this.getValue($widget);
            }
        }
    }));

    // 输入控件
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "input-rythm",
        //
        isDisabled : function($widget) {
            return $widget.prop('readonly');
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.prop('readonly', disabled);
        }
    }));

    // textarea
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "textarea-rythm",
        isDisabled : function($widget) {
            return $widget.prop('disabled');
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.prop('readonly', disabled);
        },
        // 设定值
        setValue : function($widget, val) {
            $widget.val(val);
        },
        // 清空值
        clearValue : function($widget) {
                $widget.val('');
        },
        // 获得值
        getValue : function($widget) {
            return $widget.val();
        }
    }));

    // Check
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "check-rythm",
        isDisabled : function($widget) {
            return $widget.icheck('disabled');
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.icheck(disabled ? 'disabled' : 'enabled');
        },
        // 设定值
        setValue : function($widget, val) {
            $widget.find('input').each(function() {
                $widget.icheck('unchecked');
            });
            var values = (typeof(val) == 'string') ? value.split(',') : val;
            if (values && values.length) {
                for (var i = 0; i < values.length; i++) {
                    $widget.find('input[value=' + values[i] + ']').icheck('checked');
                }
            }
        },
        // 清空值
        clearValue : function($widget) {
                $widget.find("input").icheck('unchecked');
        },
        // 获得值
        getValue : function($widget) {
            var ret = [];
            $widget.find('input:checked').each(function() {
                ret.push($(this).val());
            });
            return ret.join(',');
            return ret;
        },
        // 序列化
        serialize : function($widget, data) {
            var name = $widget.find("input:checked").attr("name");
            if (name && name != '') {
                data[name] = this.getValue($widget);
            }
        }
    }));
    
    // 下拉控件
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "rythm-selectpicker",
        isDisabled : function($widget) {
            return $widget.find(".selectpicker").prop("disabled");
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            // 顶层容器
            var $div = $widget;
            // 容器
            var $bootstrapselect = $div.find("div.bootstrap-select");
            // 按钮
            var $btn = $bootstrapselect.find(".btn.dropdown-toggle");
            // 下拉框
            var $select = $div.find("select.selectpicker");
            if (disabled) {
                $bootstrapselect.addClass("disabled");
                $btn.addClass("disabled");
            } else {
                $bootstrapselect.removeClass("disabled");
                $btn.removeClass("disabled");
            }
            // Select本身
            $select.prop("disabled", disabled);
        },
        // 设定值
        setValue : function($widget, val) {
            $widget.find(".selectpicker").selectpicker('val', val);;
        },
        // 清空值
        clearValue : function($widget) {
            $widget.find(".selectpicker").selectpicker('val', "");
        },
        // 获得值
        getValue : function($widget) {
            return $widget.find(".selectpicker").selectpicker('val');
        },
        // 获取名字
        getName : function($widget) {
            return $widget.find(".selectpicker").attr("name");
        }
    }));

    // 下拉树控件
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "rythm-comboztree",
        isDisabled : function($widget) {
            return $widget.ComboZTree('isDisabled');
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.ComboZTree('setDisabled', disabled);
        },
        // 设定值
        setValue : function($widget, setValue) {
            $widget.ComboZTree('setValue', setValue);;
        },
        // 清空值
        clearValue : function($widget) {
                $widget.ComboZTree('setValue', '');
        },
        // 获得值
        getValue : function($widget) {
            return $widget.ComboZTree('setValue');
        }
    }));
    // DateHM
    _WidgetApiReg.push($.extend({}, _WidgetDefaultApi, {
        className : "rythm-datehm",
        //
        isDisabled : function($widget) {
            return $widget.find("input").prop('readonly');
        },
        // 设定是否禁用
        setDisabled : function($widget, disabled) {
            $widget.find("input").prop('readonly', disabled);
        },
        // 设定值
        setValue : function($widget, val1, val2) {
            $widget.find(".rythm-datehm-h input").val(val1);
            $widget.find(".rythm-datehm-m input").val(val2);
        },
        // 清空值
        clearValue : function($widget) {
                $widget.find("input").val('');
        },
        // 获得值
        getValue : function($widget) {
            var ret = {};
            $widget.find("input").each(function() {
                ret[this.name] = $(this).val();
            });
            return ret;
        },
        // 序列化
        serialize : function($widget, data) {
            $widget.find("input").each(function() {
                data[this.name] = $(this).val();
            });
        }
    }));

    function fnEach(fn) {
        for (var i = 0; i < _WidgetApiReg.length; i++) {
            var api = _WidgetApiReg[i];
            if (false === fn.call(api, api)) {
                break;
            }
        }
    }

    function fnSetValue($widget, val) {
        var arg = arguments;
        App.Widget.each(function(api) {
            if (api.isInstance($widget)) {
                value = api.setValue.apply(api, arg);
            }
        });
    }

    function fnGetValue($widget) {
        var value = '';
        App.Widget.each(function(api) {
            if (api.isInstance($widget)) {
                value = api.getValue.call(api, $widget);
                return false;
            }
        });
        return value;
    }
    // 组件初期化方法
    $(function(){
        $(".rythm-label.with-popover").popover({ trigger: "hover",container:"body" });
    });
    return {
        "each" : fnEach,
        "setValue" : fnSetValue,
        "getValue" : fnGetValue
    }
}(jQuery, window, document);

// Form
var Form = App.Form = function($, window, doucument) {
    // 禁止From
    function fnDisableForm(form, disabled) {
        var $form = $(form);
        App.Widget.each(function(api) {
            api.selectWidget.call(api, $form).each(function() {
                api.setDisabled.call(api, $(this), disabled);
            });
        });
    }

    // 清除Form控件的值(除了table)
    function fnClearForm(form, excludeDisabled) {
        var $form = $(form);
        App.Widget.each(function(api) {
            api.selectWidget.call(api, $form).each(function() {
                if(!(excludeDisabled && api.isDisabled.call(api, $(this)))){
                    api.clearValue.call(api, $(this));
                }
            });
        });
        
    }

    // 获得FORM序列化值
    function fnSerializeForm(form) {
        var retData = {};
        var $form = $(form);
        App.Widget.each(function(api) {
            api.selectWidget.call(api, $form).each(function() {
                api.serialize.call(api, $(this), retData);
            });
        });
        return retData;
    }

    /**
     * 功能：默认刷新id为search-result的table
     */
    function fnRefreshTable() {
        var params = {};
        params.toSetPageNumber = 1;
        $('#search-result').bootstrapTable('refresh', params);
    }

    /**
     * 功能：清除查询条件以及查询结果 参数：btn:当前清除按钮
     * 参数：formId:需要清除的指定form的id，可以不指定，则会自动查找页面所有的form
     */
    function fnClearSearch(form) {
        var $form;
        if (typeof form === 'string') {
            $form = $("#" + form);
        } else {
            $form = $(form);
        }
        //清除控件val
        fnClearForm($form);
       //清除控件Table
        var tbo = $('.table-rythm').bootstrapTable('getOptions');
        if (tbo) {
            tbo.totalRows = 0;
            tbo.pageNumber = 1;
        }
        if (form) {
            $form.find('.table-rythm').bootstrapTable('load', {
                record : 0,
                data : []
            });
        } else {
            $('.table-rythm').bootstrapTable('load', {
                record : 0,
                data : []
            });
        }
    }

    return {
        // 刷新表格
        refreshTable : fnRefreshTable,
        // 清除查询条件以及查询结果
        clearSearch : fnClearSearch,
        //是否可用
        disableForm : fnDisableForm,
        //清除查询条件
        clearForm : fnClearForm,
        //序列化
        serializeForm : fnSerializeForm

    };
}(jQuery, window, document);

// DualListbox
var DualListbox = App.DualListbox = function($, window, doucument) {
    "use strict";
    function fnShow(row, options) {
        var opt = $.extend({
            nonSelectedListLabel : '未选择',
            selectedListLabel : '已选择',
            preserveSelectionOnMove : 'moved',
            moveOnSelect : false,
            url : '',
            onSave : function() {
            }
        }, options);
        var userId = row.userId;
        var personName = row.personName;

        BootstrapDialog.show({
            title : '用户[' + personName + '] - 角色配置',
            message : function(dialog) {
                return '<select id=\"select_' + dialog.options.id + '\" multiple=\"multiple\"><\/select>';
            },
            onshow : function(dialog) {
                var dualListbox = $('#\'select_' + dialog.options.id + '\'').bootstrapDualListbox();
                // 后台取数据
                ajax({
                    url : '@url(opt.url)',
                    data : {
                        userId : userId
                    },
                    type : "post",
                    success : function(result) {
                        // 成功
                        for (var i = 0; i < result.length; i++) {
                            var row = result[i];
                            var selected = row.selected ? " selected " : "";
                            dualListbox.append('<option value="' + row.roleId + '"' + selected + '>' + row.roleName
                                    + '</option>');
                        }
                        $('#select_' + dialog.options.id).bootstrapDualListbox('refresh', true);
                    }
                });
            },
            buttons : [{
                    label : '确定',
                    cssClass : 'fa fa-check btn-normal',
                    id : 'btnChangePwdSave',
                    action : function(dialog) {
                        var foo = [];
                        $('#select_' + dialog.options.id + ' :selected').each(function(i, selected) {
                            foo[i] = $(selected).val();
                        });
                        if (typeof opt.onSave === 'function') {
                            if (false !== opt.onSave(foo)) {
                                dialog.close();
                            };
                        } else {
                            dialog.close();
                        }
                    }
                }, {
                    label : '取消',
                    cssClass : 'btn-normal fa fa-close',
                    action : function(dialog) {
                        this.dialog.close();
                    }
                }]
        });
    }
    // 对外公开的函数.
    return {
        show : fnShow
    };
}(jQuery, window, document);

// InputMask 对于输入框进行数据的限制
var InputMask = App.InputMask = function($, window, doucument) {
    "use strict";
    $(function() {
        // 键盘事件
        $("input.input-mask").on("keypress", function(event) {
            // jQuery对象
            var $this = $(this);
            // 类型属性
            var type = $this.attr("data-im-type");
            // 字符(keypress事件中的输入字符等于keyCode)
            var charCode = event.keyCode;
            // "数字","银行卡号","手机号"的场合
            if (type == "number" || type == "bank" || type == "mobile") {
                // 只能输入0-9的数字
                return (charCode >= 48 && charCode <= 57);
            }
            if (type == "numbernew" ) {
                // 只能输入0-9的数字
                return ((charCode >= 48 && charCode <= 57) || charCode == 189 || charCode == 109);
            }
            /* 电话号码 */
            if (type == "phone") {
                // 只能输入0-9的数字和横线
                return ((charCode >= 48 && charCode <= 57) || charCode == 45);
            }
            /* 小数 */
            if (type == "float") {
                // 只能输入0-9的数字和小数点
                return ((charCode >= 48 && charCode <= 57) || charCode == 46);
            }
            /* 正负小数 */
            if (type == "floatNegative") {
                // 只能输入0-9的数字、负号和小数点
                return ((charCode >= 48 && charCode <= 57) || charCode == 46 || charCode == 189 || charCode == 109);
            }
            /* 身份证 */
            if (type == "idcard") {
                // 只能输入0-9的数字和X
                return ((charCode >= 48 && charCode <= 57) || charCode == 88);
            }
            // 以外的情况，则通过
            return true;
        }).on("keyup", function(event) {

        }).on("input", function(event) {

        });
    })
}(jQuery, window, document);

function rowLink(link, rowIndex, callback){
    var row = $(link).parentsUntil('.fixed-table-body','table').bootstrapTable('getData')[rowIndex];
    callback(row, rowIndex);
}

function buildQueryParam(form, params){
    return $.extend(params,buildFormData(form));
}

function createQueryParams(params){
    return buildQueryParam('#search-condition', params);
}

function buildFormData(form){
    var data = $(form).serializeObject();
    //switch
    $(form).find('.switch-rythm').each(function(){
        data[$(this).attr('name')] = $(this).is(':checked');
    });
    //选择器
    $(form).find('.selector-rythm').each(function(){
        if($(this).attr('name')){
            data[$(this).attr('name')] = getValue($(this));
        }
    });
    return data;
}
$.fn.serializeObject = function() {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [ o[this.name] ];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
}

//iCheck
window.icheck = {
        autoInit: false,
        autoAjax: true,
        tap: true,
        checkboxClass: 'icheckbox_square-red',
        radioClass: 'iradio_square-red'
};

function dateFormat(value){
    var result = "";
    if(value){
        result = $.formatDateTime('yy-mm-dd', new Date(Number(value)));
    }
    return result;
}

//输入限制
function keyPress(type){
    event = window.event;
    var keyCode = event.keyCode; 
    if(keyCode >= 37 && keyCode <= 40){
        event.returnValue = true;
    }else if(type == 'number' || type == 'bank'){
        event.returnValue = (keyCode >= 48 && keyCode <= 57);
    }else if (type == "numbernew") {
        // 只能输入数字和-
    	event.returnValue = ((charCode >= 48 && charCode <= 57) || charCode == 189 || charCode == 109);
    }else if(type == 'float'){
        event.returnValue = ((keyCode >= 48 && keyCode <= 57)||event.keyCode==46);
    }else if(type == 'floatNegative'){
    	//只能输入数字 . -
    	event.returnValue = ((charCode >= 48 && charCode <= 57) || charCode==46 || charCode == 189 || charCode == 109);
    }else if(type == 'mobile' || type == 'phone'){
        event.returnValue = ((keyCode >= 48 && keyCode <= 57)||event.keyCode==189);
    }else if(type == 'idcard'){
        event.returnValue = ((keyCode >= 48 && keyCode <= 57) || event.keyCode == 88);
    }else{
        event.returnValue = true;
    }
}
//输入限制
function changeText(dome, type){
    var _this = $(dome);
    var value = _this.val();
    var nv = '';
    if(type == 'number' || type == 'bank'){
        nv = value.replace(/\D/g,'');
    }else if(type == 'float' || type == 'ip'){
        //先把非数字的都替换掉，除了数字和.
        nv = value.replace(/[^\d.]/g,"");
        //必须保证第一个为数字而不是.
        nv = nv.replace(/^\./g,"");
        //保证只有出现一个.而没有多个.
        nv = nv.replace(/\.{2,}/g,".");
        //保证.只出现一次，而不能出现两次以上
        nv = nv.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
    }else if(type == 'floatNegative'){
    	//先把非数字的都替换掉，除了数字 . -
        nv = value.replace(/[^\d.-]/g,"");
        //必须保证第一个为数字或者-而不是.
        nv = nv.replace(/^\./g,"");
        //保证只有出现一个.而没有多个.
        nv = nv.replace(/\.{2,}/g,".");
        //保证.只出现一次，而不能出现两次以上
        nv = nv.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
        //保证只有出现一个-而没有多个-
        nv = nv.replace(/\-{2,}/g,"-");
        //保证-只出现一次，而不能出现两次以上
        nv = nv.replace("-","$#$").replace(/\-/g,"").replace("$#$","-");
    }else if(type == 'mobile' || type == 'phone'){
        nv = value.replace(/[^\d-]/g,"");
    }else if(type == 'numbernew'){
        nv = value.replace(/[^\d-]/g,"");
    }else if(type == 'half'){
        nv = value.replace(/[^\x00-\xff]/g,'');
    }else if(type == 'char'){
        nv = value.replace(/[^a-zA-Z]/g,'');
    }else if(type == 'charnum'){
        nv = value.replace(/[^a-zA-Z0-9]/g,'');
    }else if(type == 'idcard'){
        nv = value.replace(/[^\dX]/g,"");
    }else{
        return;
    }
    if(nv == value){
        return;
    }
    _this.val(nv);
    //_this.change();
    //$(_this[0].form).bootstrapValidator('revalidateField', _this.attr('name'));
}
//禁止enter键、backspace键
document.onkeydown = function(event) {
    var target, code, tag;
    if (!event) {
        event = window.event;// 针对ie浏览器
        target = event.srcElement;
        code = event.keyCode;
        if (code == 13) {
            tag = target.tagName;
            if (tag == "TEXTAREA") { return true; }
            else { return false; }
        }
        if (code == 8) {
            tag = target.tagName;
            if (tag == "TEXTAREA" || tag == "INPUT" || $(target).parents('.wangEditor-container').size() > 0) { return true; }
            else { return false; }
        }
    }else {
        target = event.target; // 针对遵循w3c标准的浏览器，如Firefox
        code = event.keyCode;
        if (code == 13) {
            tag = target.tagName;
            if (tag == "INPUT") { return false; }
            else { return true; }
        }
        if (code == 8) {
            tag = target.tagName;
            if (tag == "TEXTAREA" || tag == "INPUT" || $(target).parents('.wangEditor-container').size() > 0) { 
                //被禁用的控件
                if($(target).attr("data-readonly") != "true" && 
                    $(target).attr("readonly") == undefined)
                return true; 
            }
            return false;
        }
    }
}; 
function getValueAny(idname){
    var value = '';
    if($("#"+idname).length > 0){
        value = App.Widget.getValue($('#'+idname));
    }else if($('[name='+idname + ']').length>0){
        value = App.Widget.getValue($('[name='+idname + ']'));
    }else{
        value = App.Widget.getValue($(idname));
    }
    return value;
}

function checkValidity(object){
	if (object[0].checkValidity()) {
		return "true";
	} else {
		return "false";
	}
	
}

//FileInput相关设定
!function($, window, doucument) {
    // FileInput组件默认值
    $.fn.fileinput.defaults = $.extend($.fn.fileinput.defaults, {
        /* 浏览按钮的Class */
        browseIcon : '<i class="fa fa-folder-open"></i>',
        browseClass : 'btn btn-default',
        removeIcon : '<i class="fa fa-trash"></i>',
        removeClass : 'btn btn-default',
        cancelIcon : '<i class="fa fa-stop-circle-o"></i>',
        cancelClass : 'btn btn-default',
        uploadIcon : '<i class="fa fa-upload"></i>',
        uploadClass : 'btn btn-default',
        msgValidationErrorIcon : '<i class="fa fa-exclamation-circle"></i> ',
        indicatorSuccess : '<i class="fa fa-check-circle text-success"></i>',
        indicatorError : '<i class="fa fa-exclamation-circle text-danger"></i>',
        /* 默认模版 */
        layoutTemplates : {
            fileIcon : '<i class="fa fa-file kv-caption-icon"></i>'
        }
    });
}(jQuery, window, document);


/**
 * 绑定KeyUp事件，防止海量提交.
 * @param $target 目标对象
 * @param func 执行的方法
 */
function bindKeyUpEvent($target, func) {
    // 获得当前对象
    var $this = $($target);
    // 绑定KeyUp事件
    $this.off("keyup").on("keyup", function() {
        // 获得定时任务
        var tid = $this.data("_tid");
        // 如果存在未执行的定时任务
        if (tid != null) {
            // 取消任务
            clearTimeout(tid);
        }
        // 设定定时任务
        $this.data("_tid", setTimeout(function() {
            // 执行参数中的函数
            func.apply($this);
        }, 500));
    });
}