/*!
 * @author zhixin wen <wenzhixin2010@gmail.com>
 * @version: v1.0.1
 * @patch  : 0.0.24
 */
/**
 * - 0.0.19_1.增加固定列的选择框功能 xiongke 20180120
 *         _2.修正hover的CSS xiongke 20180122
 *         _3.解决固定列的排序问题 xiongke 20180122
 *         _4.解决固定列的滚动条高度计算问题 xiongke 20180122
 * - 0.0.20_1.解决IE11下固定列空白问题
 * - 0.0.24_1.解决IPad下出现不跟随滚动的情况(Fixed #159)
 *         _2.解决行对不齐的情况(Fixed #160)，并兼容IE11、Chrome、Firefox、Edge
 */
(function ($) {
    'use strict';

    $.extend($.fn.bootstrapTable.defaults, {
        fixedColumns: false,
        fixedNumber: 1
    });
    // 重写BootstrapTable的原生方法
    var BootstrapTable = $.fn.bootstrapTable.Constructor,
        _initHeader = BootstrapTable.prototype.initHeader,
        _initBody = BootstrapTable.prototype.initBody,
        // add by xiongke 0.0.19_1 start
        _updateSelected = BootstrapTable.prototype.updateSelected,
        // add by xiongke 0.0.19_1 end
        // add by xiongke 0.0.19_3 start
        _getCaret = BootstrapTable.prototype.getCaret,
        // add by xiongke 0.0.19_3 end
        // add by xiongke 0.0.24_1 start
        _fitHeader = BootstrapTable.prototype.fitHeader,
        // add by xiongke 0.0.24_1 end
        _resetView = BootstrapTable.prototype.resetView;

    BootstrapTable.prototype.initFixedColumns = function () {
        this.$fixedHeader = $([
            '<div class="fixed-table-header-columns">',
            '<table>',
            '<thead></thead>',
            '</table>',
            '</div>'].join(''));

        this.timeoutHeaderColumns_ = 0;
        this.$fixedHeader.find('table').attr('class', this.$el.attr('class'));
        this.$fixedHeaderColumns = this.$fixedHeader.find('thead');
        this.$tableHeader.before(this.$fixedHeader);

        this.$fixedBody = $([
            '<div class="fixed-table-body-columns">',
            '<table>',
            '<tbody></tbody>',
            '</table>',
            '</div>'].join(''));

        this.timeoutBodyColumns_ = 0;
        this.$fixedBody.find('table').attr('class', this.$el.attr('class'));
        this.$fixedBodyColumns = this.$fixedBody.find('tbody');
        this.$tableBody.before(this.$fixedBody);
    };

    BootstrapTable.prototype.initHeader = function () {
        _initHeader.apply(this, Array.prototype.slice.apply(arguments));

        if (!this.options.fixedColumns) {
            return;
        }

        this.initFixedColumns();

        var that = this, $trs = this.$header.find('tr').clone();
        $trs.each(function () {
            $(this).find('th:gt(' + that.options.fixedNumber + ')').remove();
        });
        this.$fixedHeaderColumns.html('').append($trs);
        // add by xiongke 0.0.19_1 start
        that.$fixedSelectAll = that.$fixedHeader.find('[name="btSelectAll"]');
        that.$fixedSelectAll.off('click.fixed-columns').on('click.fixed-columns', function () {
            that.$selectAll.click();
        });
        // add by xiongke 0.0.19_1 end
        // add by xiongke 0.0.19_3 start
        this.$fixedHeaderColumns.off('click', '.th-inner.sortable').on('click', '.th-inner.sortable', function (event) {
            var index = $(this).parent().index();
            var $fixedThs = that.$tableHeader.find("table thead .th-inner");
            // 如果是垂直滚动场合
            if ($fixedThs.length > 0) {
                $fixedThs.eq(index).click();
            } else {
                // 非垂直滚动场合
                var $bodyThs = that.$tableBody.find("table thead .th-inner");
                if ($bodyThs.length > 0) {
                    $bodyThs.eq(index).click();
                }
            }
        });
        // add by xiongke 0.0.19_3 end
    };

    // add by xiongke 0.0.19_3 start
    BootstrapTable.prototype.getCaret = function () {
        _getCaret.apply(this, Array.prototype.slice.apply(arguments));
        if (!this.options.fixedColumns) {
            return;
        }
        var that = this;
        if (this.$fixedHeaderColumns) {
            $.each(this.$fixedHeaderColumns.find('th'), function (i, th) {
                $(th).find('.sortable').removeClass('desc asc').addClass(
                    $(th).data('field') === that.options.sortName ? that.options.sortOrder : 'both');
            });
        }
    };
    // add by xiongke 0.0.19_3 end

    // add by xiongke 0.0.19_1 start
    BootstrapTable.prototype.updateSelected = function () {
        _updateSelected.apply(this, Array.prototype.slice.apply(arguments));
        if (!this.options.fixedColumns) {
            return;
        }
        var that = this;
        // 更新固定列的CheckBox
        if (that.$selectAll) {
            that.$fixedSelectAll.prop("checked", that.$selectAll.prop("checked"));
        }
        if (that.$fixedSelectItem) {
            that.$fixedSelectItem.each(function(i) {
                $(this).prop("checked", that.$selectItem.eq(i).prop("checked"));
                $(this).closest('tr')[$(this).prop('checked') ? 'addClass' : 'removeClass']('selected');
            });
        }
    };
    // add by xiongke 0.0.19_1 end
    BootstrapTable.prototype.initBody = function () {
        _initBody.apply(this, Array.prototype.slice.apply(arguments));

        if (!this.options.fixedColumns) {
            return;
        }

        var that = this,
            rowspan = 0;

        this.$fixedBodyColumns.html('');
        this.$body.find('> tr[data-index]').each(function () {
            var $tr = $(this).clone(),
                $tds = $tr.find('td');

            // edit by xiongke 0.0.20_1 start
            //$tr.html('');
            var dataIndex = $tr.attr("data-index");
            $tr = $("<tr></tr>");
            $tr.attr("data-index", dataIndex);
            // edit by xiongke 0.0.20_1 end
            var end = that.options.fixedNumber;
            if (rowspan > 0) {
                --end;
                --rowspan;
            }
            for (var i = 0; i < end; i++) {
                $tr.append($tds.eq(i).clone());
            }
            that.$fixedBodyColumns.append($tr);

            if ($tds.eq(0).attr('rowspan')){
                rowspan = $tds.eq(0).attr('rowspan') - 1;
            }
        });
        // add by xiongke 0.0.19_1 start
        this.$fixedSelectItem = this.$fixedBodyColumns.find('[name="' + this.options.selectItemName + '"]');
        this.$fixedSelectItem.each(function(i) {
            $(this).off('click.fixed-columns').on('click.fixed-columns', function () {
                that.$selectItem.eq(i).click();
            });
        });
        // add by xiongke 0.0.19_1 end
    };

    // add by xiongke 0.0.24_1 start
    BootstrapTable.prototype.fitHeader = function () {
        // 调用原来的方法
        _fitHeader.apply(this, Array.prototype.slice.apply(arguments));

        if (!this.options.fixedColumns) {
            return;
        }
        // 添加滚动伴随
        var that = this;
        this.$tableBody.on('scroll', function () {
            // 固定数据跟随滚动
            that.$fixedBody.scrollTop($(this).scrollTop());
        });
    };
    // add by xiongke 0.0.24_1 end

    BootstrapTable.prototype.resetView = function () {
        _resetView.apply(this, Array.prototype.slice.apply(arguments));

        if (!this.options.fixedColumns) {
            return;
        }

        clearTimeout(this.timeoutHeaderColumns_);
        this.timeoutHeaderColumns_ = setTimeout($.proxy(this.fitHeaderColumns, this), this.$el.is(':hidden') ? 100 : 0);

        clearTimeout(this.timeoutBodyColumns_);
        this.timeoutBodyColumns_ = setTimeout($.proxy(this.fitBodyColumns, this), this.$el.is(':hidden') ? 100 : 0);
    };

    BootstrapTable.prototype.fitHeaderColumns = function () {
        var that = this,
            visibleFields = this.getVisibleFields(),
            headerWidth = 0;

        this.$body.find('tr:first-child:not(.no-records-found) > *').each(function (i) {
            var $this = $(this),
                index = i;

            if (i >= that.options.fixedNumber) {
                return false;
            }

            if (that.options.detailView && !that.options.cardView) {
                index = i - 1;
            }

            that.$fixedHeader.find('th[data-field="' + visibleFields[index] + '"]')
                .find('.fht-cell').width($this.innerWidth());
            headerWidth += $this.outerWidth();
        });
        this.$fixedHeader.width(headerWidth + 1).show();
    };
    BootstrapTable.prototype.fitBodyColumns = function () {
        // del by xiongke 0.0.24_2 start
//        var that = this,
//            top = -(parseInt(this.$el.css('margin-top')) - 2),
//            // the fixed height should reduce the scorll-x height
//            // edit by xiongke 0.0.19_4 start
//            //height = this.$tableBody.height() - 14;
//            height = this.$tableBody.height() - this.$tableBody[0].offsetHeight + this.$tableBody[0].clientHeight;
//            // edit by xiongke 0.0.19_4 end
        // del by xiongke 0.0.24_2 end

        if (!this.$body.find('> tr[data-index]').length) {
            this.$fixedBody.hide();
            return;
        }

        // del by xiongke 0.0.24_2 start
//        if (!this.options.height) {
//            top = this.$fixedHeader.height();
//            height = height - top;
//        }
        // del by xiongke 0.0.24_2 end

        // add by xiongke  0.0.24_2 start
        var that = this, top = this.headerOuterHeight(), height;
        if (!this.options.height) {
            height = this.$body.height();
        } else {
            height = this.$tableBody[0].clientHeight;
        }
        // add by xiongke 0.0.24_2 end

        this.$fixedBody.css({
            width: this.$fixedHeader.width(),
            height: height,
            top: top
        }).show();

        this.$body.find('> tr').each(function (i) {
            // edit by xiongke  0.0.24_2 start
//            that.$fixedBody.find('tr:eq(' + i + ')').height($(this).height() - 1);
            that.$fixedBody.find('tr:eq(' + i + ')').height($(this).height());
            // edit by xiongke  0.0.24_2 end
        });
        // add by xiongke  0.0.24_2 start
        // 设定MarginTop，解决行对不齐的IE、FireFox和Chrome的兼容问题
        this.$fixedBody.find(">table").css("margin-top",
            this.$fixedBody.find(">table > tbody").outerHeight() - this.$fixedBody.find(">table").outerHeight());
        // add by xiongke 0.0.24_2 end
        // del by xiongke 0.0.24_1 start
//        // events
//        this.$tableBody.on('scroll', function () {
//            that.$fixedBody.find('table').css('top', -$(this).scrollTop());
//        });
        // del by xiongke 0.0.24_1 end

        this.$body.find('> tr[data-index]').off('hover').hover(function () {
            var index = $(this).data('index');
            // add by xiongke 0.0.19_2 start
            that.$body.find('tr[data-index="' + index + '"]').addClass('hover');
            // add by xiongke 0.0.19_2 end
            that.$fixedBody.find('tr[data-index="' + index + '"]').addClass('hover');
        }, function () {
            var index = $(this).data('index');
            // add by xiongke 0.0.19_2 start
            that.$body.find('> tr[data-index="' + index + '"]').removeClass('hover');
            // add by xiongke 0.0.19_2 end
            that.$fixedBody.find('tr[data-index="' + index + '"]').removeClass('hover');
        });
        this.$fixedBody.find('tr[data-index]').off('hover').hover(function () {
            var index = $(this).data('index');
            that.$body.find('tr[data-index="' + index + '"]').addClass('hover');
            // add by xiongke 0.0.19_2 start
            that.$fixedBody.find('tr[data-index="' + index + '"]').addClass('hover');
            // add by xiongke 0.0.19_2 end
        }, function () {
            var index = $(this).data('index');
            that.$body.find('> tr[data-index="' + index + '"]').removeClass('hover');
            // add by xiongke 0.0.19_2 start
            that.$fixedBody.find('tr[data-index="' + index + '"]').removeClass('hover');
            // add by xiongke 0.0.19_2 end
        });
    };

})(jQuery);
