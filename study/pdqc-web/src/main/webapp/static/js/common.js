////早期IE无此方法
//if (!Object.keys) {
//  Object.keys = (function () {
//    var hasOwnProperty = Object.prototype.hasOwnProperty,
//        hasDontEnumBug = !({toString: null}).propertyIsEnumerable('toString'),
//        dontEnums = [
//          'toString',
//          'toLocaleString',
//          'valueOf',
//          'hasOwnProperty',
//          'isPrototypeOf',
//          'propertyIsEnumerable',
//          'constructor'
//        ],
//        dontEnumsLength = dontEnums.length;
//    return function (obj) {
//      if (typeof obj !== 'object' && typeof obj !== 'function' || obj === null) throw new TypeError('Object.keys called on non-object');
//      var result = [];
//      for (var prop in obj) {
//        if (hasOwnProperty.call(obj, prop)) result.push(prop);
//      }
//      if (hasDontEnumBug) {
//        for (var i=0; i < dontEnumsLength; i++) {
//          if (hasOwnProperty.call(obj, dontEnums[i])) result.push(dontEnums[i]);
//        }
//      }
//      return result;
//    }
//  })()
//};

/*function rowLink(link, rowIndex, callback){
	var row = $(link).parentsUntil('.fixed-table-body','table').bootstrapTable('getData')[rowIndex];
	callback(row, rowIndex);
}*/

/*function buildQueryParam(form, params){
	return $.extend(params,buildFormData(form));
}*/

/*function buildQueryCondition(formid, tableid){
	var data = buildFormData('#' + formid);
	var btop = $('#' + tableid).bootstrapTable("getOptions");
	return $.extend(data,{
		pageNumber:btop.pageNumber,
		pageSize:btop.pageSize,
		sortName:btop.sortName,
		sortOrder:btop.sortOrder
	});
}*/

/*function createQueryParams(params){
	return buildQueryParam('#search-condition', params);
}*/

/*function buildHistQueryString(moduleId, params){
	return $.base64.encode(moduleId + "=" + $.base64.encode($.param(params)));
}*/
/*function resetLabelsWidth(){
	$('.label-rythm').each(function(){
		var group = $(this).parentsUntil('.group-rythm');
		var groupWidth = group.offsetParent().width();
		var labelWidth = group.find('.input-group-label').width();
		var requiredWidth = 20;
		$(this).width(groupWidth - labelWidth - requiredWidth);
	});
	// add by kxiong 20161014 解决下拉框宽度问题 start
	resetComboxWidth($('div.combobox-rythm'));
     // add by kxiong 20161014 解决下拉框宽度问题 end
}*/
// add by kxiong 20161014 解决下拉框宽度问题 start
/*function resetComboxWidth(oCombox){
	if (oCombox) {
		oCombox.each(function(){
	        var group = $(this).parentsUntil('.group-rythm');
	        var groupWidth = group.offsetParent().width();
	        var labelWidth = group.find('.input-group-label').width();
	        var requiredWidth = 20;
	        var caretWidth = 46;
	        var optionWidth = groupWidth - labelWidth - requiredWidth - caretWidth;
	        $(this).find("button span:first").css("width", optionWidth + "px");
	    });
	}
}*/
// add by kxiong 20161014 解决下拉框宽度问题 end
/**
 * 功能：默认刷新id为search-result的table
 */
/*function refreshTable(){
	var params = {};
	params.toSetPageNumber = 1;
	$('#search-result').bootstrapTable('refresh',params);
}*/

/*function isDisabled(element){
	var el = $(element);
	//输入控件
	if(el.hasClass('input-rythm') || el.hasClass('textarea-rythm')){
		return el.prop('readonly');
	}
	//icheck
	if(el.hasClass('check-rythm')){
		var inputs = el.find('input');
		if(inputs && inputs.length){
			for(var i = 0; i<inputs.length;i++){
				if(!$(inputs[i]).prop('disabled')){
					return false;
				}
			}
			return true;
		}
	}
	else if(el.hasClass('icheck')){
		var disabled = true;
		el.each(function(){
			if(!$(this).prop('disabled')){
				disabled = false;
				return false;
			}
		});
		return disabled;
	}
	//日期控件
	if(el.hasClass('datetime-rythm') || el.hasClass('datetime-input-rythm')){
		return el.datetimepicker('isDisabled');
	}
	//下拉控件
	if(el.hasClass('combobox-rythm')){
		return el.selectpicker('isDisabled');
	}
	//下拉树控件
	if(el.hasClass('combotree-rythm')){
		return el.bootstrapCombotree('isDisabled');
	}
	//switch
	if(el.hasClass('switch-rythm')){
		return el.bootstrapSwitch('isDisabled') || el.bootstrapSwitch('isReadOnly');
	}
	//文件
	if(el.hasClass('file-rythm')){
		return el.fileinput('isDisable');
	}
	return $(element).prop('disabled');
}*/

/*function setValue(element, v){
	var value = getOrElse(v);
	var el = $(element);
	//输入控件
	if(el.hasClass('input-rythm') || el.hasClass('textarea-rythm')){
		return el.val(value);
	}
	//icheck
	else if(el.hasClass('check-rythm')){
		el.find('input').each(function(){
			$(this).icheck('unchecked');
		});
		var values = (typeof(v) == 'string') ?value.split(',') : v;
		if(values && values.length){
			for(var i = 0; i<values.length;i++){
				el.find('input[value=' + values[i]+ ']').icheck('checked');
			}
		}
	}
	else if(el.hasClass('icheck')){
		var values = ',' + ((typeof(v) == 'string') ?v : v.join(',')) + ',';
		el.each(function(){
			var checked = values.indexOf(',' + $(this).attr('value') + ',') > -1;
			if(checked){
				$(this).icheck('checked');
			}else{	
				$(this).icheck('unchecked');
			}
		});
	}
	//日期控件
	else if(el.hasClass('datetime-rythm') || el.hasClass('datetime-input-rythm')){
		if(typeof(v) == 'string' && !toNumber(v)){
			el.datetimepicker('val', v);
		}else if(typeof(v) == 'string' && toNumber(v)){
			el.datetimepicker('setDate', new Date(toNumber(v)));
		}else if(typeof(v) == 'object'){
			el.datetimepicker('setDate', v);
		}else if(typeof(v) == 'undefined'){
			
		}else if(typeof(v) == 'number'){
			el.datetimepicker('setDate', new Date(v));
		}else{
			el.datetimepicker('setDate', new Date(v));
		}
	}
	//下拉控件
	else if(el.hasClass('combobox-rythm')){
		el.selectpicker('val', value);
	}
	//下拉树控件
	else if(el.hasClass('combotree-rythm')){
		el.bootstrapCombotree('setValue', value);
	}else if(el.hasClass('selector-rythm')){
		//选择器
		el.bootstrapSelector('setValue', value);
	}
	//switch
	else if(el.hasClass('switch-rythm')){
		el.bootstrapSwitch('setState',v);
	}else if(el.length &&( el[0].tagName.toUpperCase() == 'SPAN' || el[0].tagName.toUpperCase() == 'DIV')){
		el.html(value);
	}else{
		el.val(value);
	}
}*/

/*function disable(element, disabled){
	var el = $(element);
	var input = el;
	if(typeof(disabled) == "undefined"){
		disabled = true;
	}
	//输入控件
	if(el.hasClass('input-rythm') || el.hasClass('textarea-rythm')){
		el.prop('readonly', disabled);
	}
	//icheck
	else if(el.hasClass('check-rythm') || el.hasClass('icheck')){
		el.icheck(disabled ? 'disabled':'enabled');
	}
	//日期控件
	else if(el.hasClass('datetime-rythm') || el.hasClass('datetime-input-rythm')){
		el.datetimepicker('setDisabled', disabled);
		input = el.datetimepicker('getInput');
	}
	//下拉控件
	else if(el.hasClass('combobox-rythm')){
		el.selectpicker('disabled', disabled);
	}
	//下拉树控件
	else if(el.hasClass('combotree-rythm')){
		el.bootstrapCombotree('setDisabled', disabled);
	}
	//switch
	else if(el.hasClass('switch-rythm')){
		el.bootstrapSwitch('setReadOnly',disabled);
	}
	//文件
	else if(el.hasClass('file-rythm')){
		el.fileinput(disabled?'disable':'enable');
	}else{
		el.attr('disabled', disabled);
	}
	disabledFieldValidators(input, disabled);
}*/

/*function getValue(element){
	var el = $(element);
	//输入控件
	if(el.hasClass('input-rythm') || el.hasClass('textarea-rythm')){
		return el.val();
	}
	//icheck
	if(el.hasClass('check-rythm')){
		var ret = [];
		el.find('input:checked').each(function(){
			ret.push($(this).val());
		});
		return ret.join(',');
	}else if(el.hasClass('icheck')){
		var ret = [];
		el.each(function(){
			if($(this).is(':checked')){
				ret.push($(this).val());
			}
		});
		return ret.join(',');
	}
	//日期控件
	else if(el.hasClass('datetime-rythm') || el.hasClass('datetime-input-rythm')){
		return el.datetimepicker('val');
	}
	//下拉控件
	else if(el.hasClass('combobox-rythm')){
		return el.selectpicker('val');
	}
	//下拉树控件
	else if(el.hasClass('combotree-rythm')){
		return el.bootstrapCombotree('getValue');
	}else if(el.hasClass('selector-rythm')){
		//选择器
		return el.bootstrapSelector('getValue');
	}
	//switch
	else if(el.hasClass('switch-rythm')){
		return el.is(':checked');
	}else if(el.length &&( el[0].tagName.toUpperCase() == 'SPAN' || el[0].tagName.toUpperCase() == 'DIV')){
		return el.html();
	}else {
		return el.val();
	}
}*/

/*function getText(element){
	var el = $(element);
	//输入控件
	if(el.hasClass('input-rythm') || el.hasClass('textarea-rythm')){
		return el.val();
	}
	//icheck
	if(el.hasClass('check-rythm')){
		//icheck
		var ret = [];
		el.find('input:checked').each(function(){
			ret.push($(this).parentsUntil('.check-body','label').text());
		});
		return ret.join(',');
	}else if(el.hasClass('icheck')){
		var ret = [];
		el.each(function(){
			if($(this).is(':checked')){
				ret.push($(this).parentsUntil('.check-body','label').text());
			}
		});
		return ret.join(',');
	}
	//日期控件
	else if(el.hasClass('datetime-rythm') || el.hasClass('datetime-input-rythm')){
		return el.datetimepicker('val');
	}
	//下拉控件
	else if(el.hasClass('combobox-rythm')){
		return el.selectpicker('text');
	}
	//下拉树控件
	else if(el.hasClass('combotree-rythm')){
		return el.bootstrapCombotree('getText');
	}else if(el.hasClass('selector-rythm')){
		//选择器
		return el.bootstrapSelector('getText');
	}
	//switch
	else if(el.hasClass('switch-rythm')){
		return el.is(':checked');
	}
	//label
	else if(el.hasClass('label-rythm')){
		//去除回车
		return el.html().replace(/(^\s+)|(\s+$)/g, "");
	}
	else if(el.length &&( el[0].tagName.toUpperCase() == 'SPAN' || el[0].tagName.toUpperCase() == 'DIV')){
		return el.html();
	}else {
		return el.val();
	}
}*/

/*//form为jquery对象
function setFormValue(formData, form){
	if(formData && typeof(formData) == 'object'){
		for(var p in formData){ 
			if (typeof(formData[p]) != "function"){
				var value = formData[p];
				if(domExsit(p) && (!form || $(form).find('#'+p).length>0)){
					setValue($('#'+p), value);
				}else if(domExsit('div_' + p)&& (!form || $(form).find('#div_' + p).length>0)){
					var el = $('#div_'+p);
					if(el.hasClass('check-rythm')){
						setValue(el, value);
					}
				}else if((!form || $(form).find('[name='+p + ']').length>0)){
					setValue($('[name='+p + ']'), value);
				}
			}
		}
	}
}*/

/*function setValueAny(idname,value){
	if(domExsit(idname)){
		setValue($('#'+idname), value);
	}else if(domExsit('div_' + idname)){
		var el = $('#div_'+idname);
		if(el.hasClass('check-rythm')){
			setValue(el, value);
		}
	}else if($('[name='+idname + ']').length>0){
		setValue($('[name='+idname + ']'), value);
	}else{
		setValue($(idname), value);
	}
}*/

/*function getValueAny(idname){
	var value = '';
	if(domExsit(idname)){
		value = getValue($('#'+idname));
	}else if(domExsit('div_' + idname)){
		var el = $('#div_'+idname);
		if(el.hasClass('check-rythm')){
			value = getValue(el);
		}
	}else if($('[name='+idname + ']').length>0){
		value = getValue($('[name='+idname + ']'));
	}else{
		value = getValue($(idname));
	}
	return value;
}*/

/*function getTextAny(idname){
	var text = '';
	if(domExsit(idname)){
		text = getText($('#'+idname));
	}else if(domExsit('div_' + idname)){
		var el = $('#div_'+idname);
		if(el.hasClass('check-rythm')){
			text = getText(el);
		}
	}else if($('[name='+idname + ']').length>0){
		text = getText($('[name='+idname + ']'));
	}else{
		text = getText($(idname));
	}
	return text;
}*/

/*function disableAny(idname, disabled){
	if(domExsit(idname)){
		disable($('#'+idname), disabled);
	}else if(domExsit('div_' + idname)){
		var el = $('#div_'+idname);
		if(el.hasClass('check-rythm')){
			disable(el, disabled);
		}
	}else if($('[name='+idname + ']').length>0){
		disable($('[name='+idname + ']'), disabled);
	}else{
		disable($(idname), disabled);
	}
}*/

/*function isDisabledAny(idname){
	var ret = false;
	if(domExsit(idname)){
		ret = isDisabled($('#'+idname));
	}else if(domExsit('div_' + idname)){
		var el = $('#div_'+idname);
		if(el.hasClass('check-rythm')){
			ret = isDisabled(el);
		}
	}else if($('[name='+idname + ']').length>0){
		ret = isDisabled($('[name='+idname + ']'));
	}else{
		isDisabled($(idname));
	}
	return ret;
}*/

/*function buildFormDataAll(form) {
	var data = buildFormData(form);
	//label
	$(form).find('span.label-rythm').each(function(){
		if($(this).attr('name')){
			data[$(this).attr('name')] = getText($(this));
		}
	});
	return data;
}*/

/*function buildFormData(form){
	var data = $(form).serializeObject();
	//switch
	$(form).find('.switch-rythm').each(function(){
		data[$(this).attr('name')] = $(this).is(':checked');
	});
	//下拉控件
	$(form).find('select.combobox-rythm, .combotree-rythm').each(function(){
		if($(this).attr('name')){
			data[$(this).attr('name')] = getValue($(this));
		}
	});
	//选择器
	$(form).find('.selector-rythm').each(function(){
		if($(this).attr('name')){
			data[$(this).attr('name')] = getValue($(this));
		}
	});
	return data;
}*/

/*function disabledForm(form, disabled){
	var form = $(form);
	//输入控件
	form.find('.input-rythm').each(function(){$(this).prop('readonly', disabled);});
	//textarea
	form.find('.textarea-rythm').each(function(){$(this).prop('readonly', disabled);});
	//icheck
	form.find('.check-rythm input').each(function(){
		$(this).icheck('disabled');
	});
	//日期控件
	form.find('.datetime-rythm,.datetime-input-rythm').each(function(){$(this).datetimepicker('setDisabled',disabled);});
	//下拉控件
	form.find('select.combobox-rythm').each(function(){
        $(this).selectpicker('disabled', disabled);
	});
	//下拉树控件
	form.find('.combotree-rythm').each(function(){
		$(this).bootstrapCombotree('setDisabled',disabled);
	});
	//switch
	form.find('.switch-rythm').each(function(){
		$(this).bootstrapSwitch('setReadOnly',disabled);
	});
	//文件
	form.find('.file-rythm').each(function(){
		$(this).fileinput(disabled?'disable':'enable');
	});
}*/

//var _Global_Ajax_Dialog;

//var _Global_Clear_Msg_On_Click = true;
$(function(){
	$('.link-rythm,.label-rythm,.input-select-rythm .input-group-addon').not(".dropdown-toggle,.selectpicker,.not-show-pop").popover({ trigger: "hover",container:"body" });
	
	$('.btn-back').click(function(){history.back()});
	
//	$(document).keypress(function(e) {
//		if(e.which === 13) {
//			// enter has been pressed, execute a click on .js-new:
//			$(".enter-button").first().click();
//		}
//	});
//	$(document).click(function(e) {
//		//清空消息
//		if(_Global_Clear_Msg_On_Click){
//			clearBodyMessage();
//		}
//	});
	//文本固定宽度的处理
//	resetLabelsWidth();
//	$(window).resize(function(){
//		resetLabelsWidth();
//	});
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
	
	//创建alert
	$.fn.alerts = function(cls, msg){
		//this.empty();
		var id = Math.uuid();
		this.append('<div id="' + id + '" class="alert alert-' + cls + ' fade in"><button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>' + msg + '</div>');
		$('#' + id).alert();
		return $('#' + id);
	} 
//	//validator 默认属性
//	$.fn.bootstrapValidator.DEFAULT_OPTIONS = $.extend($.fn.bootstrapValidator.DEFAULT_OPTIONS,{
//		message: '值不合法',
//		container: 'popover',
//		feedbackIcons: {
//			valid: 'fa fa-check',
//			invalid: 'fa fa-times',
//			validating: 'fa fa-refresh'
//		}
//	});
//	_Global_Ajax_Dialog = new BootstrapDialog({
//		title:'',
//		cssClass:'ajax-waiting-dialog',
//        message: '<div align="center" class="dialog-loading"><img src="' + CONTEXT_ROOT + 'static/images/loading.gif"/>&nbsp;&nbsp;正在执行您的请求，请稍等...</div>',
//        closable: false});
//	//ajax 默认属性
//	$.ajaxSetup({
//	  cache:false,
//	  global: false,
//	  error: function(req, status, e){
//		  if(req.status == 408){
//			  // 登录超时
//			  window.location.href = CONTEXT_ROOT + "login.action?code=error.session.timeout";
//		  } else if(req.status == 403){
//			  // 无访问权限
//			  warning("该资源不存在或无访问权限");
//		  }
//	  }
//	});
	//文件上传默认配置
	$.fn.fileinput.defaults = $.extend($.fn.fileinput.defaults, {
	        showPreview: false,
	        showUpload: false,
	        showDownloadReset:true,
	        browseLabel: '浏览 &hellip;',
	        removeLabel: '删除',
	        downloadLabel: '下载',
	        resetLabel: '恢复',
	        uploadLabel: '上传',
	        browseClass:'btn btn-default file-rythm-browser',
	        downloadClass:'btn btn-default file-rythm-download',
	        resetClass:'btn btn-default file-rythm-reset',
	        uploadClass:'btn btn-default file-rythm-upload',
	        removeClass:'btn btn-default file-rythm-remove',
	        maxFileSize: 100*1024,//单位KB
	        maxFileCount: 1,
	        popplace:'top',
	        msgFoldersNotAllowed:'只能选择文件',
	        msgRequired:'必须上传文件',
	        msgSizeTooLarge: '文件 "{name}" ({size} KB) 超过了允许上传的最大大小：{maxSize} KB. 请重新选择文件!',
	        msgFilesTooMany: '上传文件数({n}) 超过了允许上传的最大文件数 {m}. 请重新选择文件!',
	        msgFileNotFound: '文件 "{name}" 未找到!',
	        msgFileNotReadable: '文件 "{name}" 不可读.',
	        msgFilePreviewAborted: '文件预览忽略文件 "{name}".',
	        msgFilePreviewError: '读文件时发生错误 "{name}".',
	        msgInvalidFileType: '文件类型不合法 "{name}". 仅能选择 "{types}" 等类型的文件进行上传.',
	        msgInvalidFileExtension: '文件扩展名不合法 "{name}". 仅能选择 "{extensions}" 等文件进行上传.',
	        msgValidationError: '<span class="text-danger"><i class="fa fa-exclamation-circle"></i><i class="form-control-feedback bv-no-label bv-icon-input-group fa fa-times"></i> 选择的文件不合法</span>',
	        msgRequiredError: '<span class="text-danger"><i class="fa fa-exclamation-circle"></i><i class="form-control-feedback bv-no-label bv-icon-input-group fa fa-times"></i> {errorMsg}</span>',
	        msgLoading: '文件加载中 {index} / {files} &hellip;',
	        msgProgress: '文件加载中 {index} / {files} - {name} - {percent}% 已完成.',
	        msgSelected: '{n} 个文件被选中'
	    });
});

/*// iCheck
window.icheck = {
		autoInit: false,
		autoAjax: true,
		tap: true,
		checkboxClass: 'icheckbox_square-red',
		radioClass: 'iradio_square-red'
};*/

//function ajax(options) {
//    var success = options.success;
//    var mask = options.mask;
//    var bodyMsg = options.bodyMsg;
//    options = $.extend({error:function(){
//    	var msg = "无法访问网络";
//		var r = bodyMsg ? parent.bodyError(msg) : parent.error(msg);
//    }}, options);
//    options.success = function(result, textStatus, jqXHR) {
//		if(result ==  "accessdenied"){
//			var msg = "无访问权限";
//			var r = bodyMsg ? parent.bodyError(msg) : parent.error(msg);
//		}else{
//			if(success && (!result.hasOwnProperty('status') || result.status)){
//				success(result, textStatus, jqXHR);
//			}
//			if(result.messages){
//				var sr = result.status ? (bodyMsg ? parent.bodySuccess(result.messages) : parent.success(result.messages)) : (bodyMsg ? parent.bodyError(result.messages) : parent.error(result.messages));
//			}
//		}
//    };
//    if(mask){
//    	options = $.extend({
//		 beforeSend:function(){
//			  parent._Global_Ajax_Dialog.open();
//			  var $modal = parent._Global_Ajax_Dialog.getModal();
//			  var $backdrop = $modal.data('bs.modal').$backdrop;
//              $modal.css('z-index', 9010);
//              $backdrop.css('z-index', 9000);
//		  },
//		  complete:function(){
//			  parent._Global_Ajax_Dialog.close();
//		  }
//		}, options);
//    }
//    return $.ajax(options);
//}

/*function format_number(n, precision){
	if(!n && n != 0){
		return "";
	} else if($.isNumeric(n)){
		if($.isNumeric(precision) && precision >= 0){
			var p = Math.pow(10, precision);
			n = Math.round(n * p) / p;
		}
		var b = n.toString();
		var flag = "";
		if(b.indexOf("-") == 0){
			b = b.substring(1);
			flag = "-";
		}
		var dot = b.indexOf(".");
		var len = dot >= 0 ? dot : b.length;
		if(len<=3){return flag + b;}
		var r=len%3;
		var f = dot >= 0 ? b.substring(dot) : ""
		var ret = r>0?b.slice(0,r)+","+b.slice(r,len).match(/\d{3}/g).join(",")+f:b.slice(r,len).match(/\d{3}/g).join(",")+f;
		return flag + ret;
	} else {
		return n;
	}
}*/

//function longAjax(option){
//	var opt = $.extend({
//	 beforeSend:function(){
//		  _Global_Ajax_Dialog.open();
//	  },
//	  complete:function(){
//		  _Global_Ajax_Dialog.close();
//	  }
//	}, option);
//	return $.ajax(opt);
//}

/*function dateTimeFormat(value){
	var result = "";
	if(value){
		result = $.formatDateTime('yy-mm-dd hh:ii:ss', new Date(Number(value)));
	}
	return result;
}*/

/*function dateTimeFormatMi(value){
	var result = "";
	if(value){
		result = $.formatDateTime('yy-mm-dd hh:ii', new Date(Number(value)));
	}
	return result;
}*/

/*function dateFormat(value){
	var result = "";
	if(value){
		result = $.formatDateTime('yy-mm-dd', new Date(Number(value)));
	}
	return result;
}*/

/*function getOrElse(val, defval){
	if(val){
		return val;
	}
	if(!val && defval){
		return defval;
	}
	return "";
}*/

var alertTimeouts = {};
var TIME_OUT_FOR_HIDE_MSG = 5000;
function bodyMessage(cls, msg){
	if(document.getElementById('bodyMsg')){
		var alert = $('#bodyMsg').alerts(cls, msg);
		var alertId = alert.attr('id');
		alert.show().css('opacity','0.8');
		
		alertTimeouts[alertId] = setTimeout("clearAlert('" + alertId + "')",TIME_OUT_FOR_HIDE_MSG);
		alert.hover(function(){
			 var id = $(this).attr('id');
			 var atime = alertTimeouts[id];
			 if(atime){
				 clearTimeout(atime);
			 }
			 delete alertTimeouts[id];
		 },function(){
			 var id = $(this).attr('id');
			 var atime = alertTimeouts[id];
			 if(atime){
				 clearTimeout(atime);
			 }
			 alertTimeouts[id] = setTimeout("clearAlert('" + id + "')",TIME_OUT_FOR_HIDE_MSG);
		 });
		 alert.click(function(){
			 var id = $(this).attr('id');
			 clearAlert(id);
		 });
	}
}

function clearAlert(alertId){
	$('#'+alertId).remove();
	delete alertTimeouts[alertId];
}

function clearBodyMessage(){
	if(document.getElementById('bodyMsg')){
		 $('#bodyMsg').empty();
		 for(var alertId in alertTimeouts){
			 var atimeout = alertTimeouts[alertId];
			 if(atimeout){
				 clearTimeout(atimeout);
			 }
			 delete alertTimeouts[alertId];
		 }
	}
}

function bodySuccess(msg){
	bodyMessage('success', msg);
}

function bodyInfo(msg){
	bodyMessage('info', msg);
}

function bodyError(msg){
	bodyMessage('danger', msg);
}

function bodyWarning(msg){
	bodyMessage('warning', msg);
}

/*function domExsit(id){
	 var dom = document.getElementById(id);
	 if(dom){
		 return true;
	 }else{
		 return false;
	 }
}*/
/*function getSelectionsProperty(tableId,property){
	var selections = $('#'+tableId).bootstrapTable('getSelections');
	var propertyArr = new Array();
	for(var i=0;i<selections.length;i++){
		propertyArr.push(selections[i][property]);
	}
	return propertyArr.toString();
}*/
/*function getTableProperty(tableId,property){
	var columData = $('#'+tableId).bootstrapTable('getData');
	var propertyArr = new Array();
	for(var i=0;i<columData.length;i++){
		propertyArr.push(columData[i][property]);
	}
	return propertyArr.toString();
}*/
/*function submitExit(url){
	window.location.href = url+"/home.action";
}*/

/*function multiValueText(obj, values, splitor){
	if(typeof(splitor) == "undefined"){
		splitor = ',';
	}
	if(typeof(values) == "undefined" || typeof(obj) != "object"){
		return '';
	}
	var vs = values.split(splitor);
	var ret = [];
	for(var i = 0; i < vs.length; i++){
		var v = vs[i];
		if(v && obj.hasOwnProperty(v)){
			ret.push(getOrElse(obj[v]));
		}
	}
	return ret.join(splitor);
}*/
//
//Date.prototype.isLeapYear = function () { 
//	var year = this.getFullYear();
//    return (((year % 4 === 0) && (year % 100 !== 0)) || (year % 400 === 0)); 
//};
//
//Date.prototype.getDaysInMonth = function () { 
//    return [31, (this.isLeapYear() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31][this.getMonth()];
//};
//
////在当前时间上添加年数  
//Date.prototype.addYear = function(years){  
//    return this.addMonth(12*years);      
//}  
////在当前时间上添加天数  
//Date.prototype.addDay = function(days){ 
//	var ret = new Date(this.getTime());
//    var cd = ret.getDate();  
//    cd += days;  
//    ret.setDate(cd);  
//    return ret;  
//}  
////在当前时间上添加月数  
//Date.prototype.addMonth = function(months){  
//	var ret = new Date(this.getTime());
//    var cm = ret.getMonth();  
//    var date = ret.getDate();
//    cm += months;
//    ret.setDate(1);
//    ret.setMonth(cm);    
//    ret.setDate(Math.min(date, ret.getDaysInMonth()));
//    return ret;  
//}
//
//Date.prototype.addMonthInside = function(months){ 
//	var days = months < 0? -1 : 1;
//    return this.addMonth(months).addDay(days);  
//}

//function checkFullMonth(fromDate, toDate,url){
//	if(fromDate.length < 10 || toDate.length < 10
//		|| isNaN(new Date(fromDate).getDate())
//		|| isNaN(new Date(toDate).getDate())){
//		return false;
//	}
//	var isFullMonth = false;
//	var toMonth = toDate.substring(0,7);
//	ajax({
//		url: url,
//		type: "post",
//		data: { fromDate:fromDate,toMonth:toMonth},
//		mask:false,
//		async:false,
//		success: function(data) {
//			if(toDate == data){
//				isFullMonth = true;
//			}
//		}
//	})
//	return isFullMonth;
//}
//这个方法计算不对，换成上面的方法，注释 by yangjun 2015年5月28日 12:19:05
//function checkFullMonth(fromDate, toDate){
//	if(!fromDate || !toDate){
//		return true;
//	}
//	//获取开始日期现在是几号
//	var fromDay = fromDate.getDate();
//	//获取结束日期现在是几号
//	var toDay = toDate.getDate();
//	//判断起始日期是否是1号
//	if(fromDay == 1){
//		//获取结束日期所在月的天数
//		var toDaysCount = toDate.getDaysInMonth();
//		//不是当前月的最后一天，则不是整月
//		if(toDaysCount != toDay){
//			return false;
//		}
//	}
//	//如果不是1号，则结束日期号数应当等于【开始日期号数小1】和【结束日期当月天数】中比较小的一个（这个特点在2月比较明显）
//	else{
//		var nf = fromDate.addDay(-1);
//		var ndate = new Date(toDate.getFullYear(), toDate.getMonth(), 1);
//		var day = Math.min(nf.getDate(), ndate.getDaysInMonth());
//		return day == toDate.getDate();
//	}
//	return true;
//}
////同步执行方法
//function getSyncData(url) {
//	var returnData = null; 
//	if(typeof url === 'string'){
//		$.ajax({
//			url: url,
//			async: false,
//			type: "get",
//			success: function(data) {
//				returnData = data;
//			} 
//		});
//	}
//	return returnData;
//}
/*//输入限制
function keyPress(type){
	event = window.event;
	var keyCode = event.keyCode; 
	if(keyCode >= 37 && keyCode <= 40){
		event.returnValue = true;
	}else if(type == 'number' || type == 'bank'){
		event.returnValue = (keyCode >= 48 && keyCode <= 57);
	}else if(type == 'float'){
		event.returnValue = ((keyCode >= 48 && keyCode <= 57)||event.keyCode==46);
	}else if(type == 'mobile' || type == 'phone'){
		event.returnValue = ((keyCode >= 48 && keyCode <= 57)||event.keyCode==189);
	}else if(type == 'idcard'){
		event.returnValue = ((keyCode >= 48 && keyCode <= 57) || event.keyCode == 88);
	}else{
		event.returnValue = true;
	}
}*/
//剪切板
/*function changeClipboard(type){
	var value = clipboardData.getData('text');
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
	}else if(type == 'mobile' || type == 'phone'){
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
	clipboardData.setData(nv);
}*/

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
	}else if(type == 'mobile' || type == 'phone'){
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
/*//取控件的数值
function getNumberValue(id){
	var value = $('#'+id).val();
	return isNaN(Number(value)) ? 0 : Number(value);
}*/
/*function toNumber(val){
	if(val){
		return isNaN(Number(val)) ? 0 : Number(val);
	}
	return Number(0);
}*/
/*//取小数
function getScaleNumber(value){
	if(!value || value.toString().indexOf('.') < 0){
		return 0;
	}
	var str = value.toString();
	return toNumber(str.substring(str.indexOf('.')))
}*/

/**
 ** 加法函数，用来得到精确的加法结果
 ** 说明：javascript的加法结果会有误差，在两个浮点数相加的时候会比较明显。这个函数返回较为精确的加法结果。
 ** 调用：accAdd(arg1,arg2)
 ** 返回值：arg1加上arg2的精确结果
 **/
/*function accAdd(arg1, arg2) {
    var r1, r2, m, c;
    try {
        r1 = arg1.toString().split(".")[1].length;
    }
    catch (e) {
        r1 = 0;
    }
    try {
        r2 = arg2.toString().split(".")[1].length;
    }
    catch (e) {
        r2 = 0;
    }
    c = Math.abs(r1 - r2);
    m = Math.pow(10, Math.max(r1, r2));
    if (c > 0) {
        var cm = Math.pow(10, c);
        if (r1 > r2) {
            arg1 = Number(arg1.toString().replace(".", ""));
            arg2 = Number(arg2.toString().replace(".", "")) * cm;
        } else {
            arg1 = Number(arg1.toString().replace(".", "")) * cm;
            arg2 = Number(arg2.toString().replace(".", ""));
        }
    } else {
        arg1 = Number(arg1.toString().replace(".", ""));
        arg2 = Number(arg2.toString().replace(".", ""));
    }
    return Number((arg1 + arg2) / m);
}

//给Number类型增加一个add方法，调用起来更加方便。
Number.prototype.add = function (arg) {
    return accAdd(arg, this);
};*/

/**
 ** 减法函数，用来得到精确的减法结果
 ** 说明：javascript的减法结果会有误差，在两个浮点数相减的时候会比较明显。这个函数返回较为精确的减法结果。
 ** 调用：accSub(arg1,arg2)
 ** 返回值：arg1加上arg2的精确结果
 **/
/*function accSub(arg1, arg2) {
    var r1, r2, m, n;
    try {
        r1 = arg1.toString().split(".")[1].length;
    }
    catch (e) {
        r1 = 0;
    }
    try {
        r2 = arg2.toString().split(".")[1].length;
    }
    catch (e) {
        r2 = 0;
    }
    m = Math.pow(10, Math.max(r1, r2)); //last modify by deeka //动态控制精度长度
    n = (r1 >= r2) ? r1 : r2;
    return Number(((arg1 * m - arg2 * m) / m).toFixed(n));
}

// 给Number类型增加一个mul方法，调用起来更加方便。
Number.prototype.sub = function (arg) {
    return accSub(this, arg);
};*/

/**
 ** 乘法函数，用来得到精确的乘法结果
 ** 说明：javascript的乘法结果会有误差，在两个浮点数相乘的时候会比较明显。这个函数返回较为精确的乘法结果。
 ** 调用：accMul(arg1,arg2)
 ** 返回值：arg1乘以 arg2的精确结果
 **/
/*function accMul(arg1, arg2) {
    var m = 0, s1 = arg1.toString(), s2 = arg2.toString();
    try {
        m += s1.split(".")[1].length;
    }
    catch (e) {
    }
    try {
        m += s2.split(".")[1].length;
    }
    catch (e) {
    }
    return Number(Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m));
}

// 给Number类型增加一个mul方法，调用起来更加方便。
Number.prototype.mul = function (arg) {
    return accMul(arg, this);
};*/

/** 
 ** 除法函数，用来得到精确的除法结果
 ** 说明：javascript的除法结果会有误差，在两个浮点数相除的时候会比较明显。这个函数返回较为精确的除法结果。
 ** 调用：accDiv(arg1,arg2)
 ** 返回值：arg1除以arg2的精确结果
 **/
/*function accDiv(arg1, arg2) {
    var t1 = 0, t2 = 0, r1, r2;
    try {
        t1 = arg1.toString().split(".")[1].length;
    }
    catch (e) {
    }
    try {
        t2 = arg2.toString().split(".")[1].length;
    }
    catch (e) {
    }
    with (Math) {
        r1 = Number(arg1.toString().replace(".", ""));
        r2 = Number(arg2.toString().replace(".", ""));
        return Number((r1 / r2) * pow(10, t2 - t1));
    }
}

//给Number类型增加一个div方法，调用起来更加方便。
Number.prototype.div = function (arg) {
    return accDiv(this, arg);
};*/

/*//移除validation
function disabledFieldValidators(element, disabled){
	if($(element)[0] && $(element)[0].form){
		var form = $($(element)[0].form);
		form.bootstrapValidator('enableFieldValidators', element.attr('name'), !disabled);
		if(disabled){
			clearElementValidation();
		}else{
			form.bootstrapValidator('revalidateField', element.attr('name'));
		}
		form.bootstrapValidator('updateExcludedOption', element.attr('name'),disabled);
	}
	if(element.attr('data-bv-excluded')){
		element.attr('data-bv-excluded', ''+disabled);
	}
	var groupParent = element.parents('.group-with-required');
	if(groupParent.length == 1){
		var sreq = groupParent.find('span.input-group-required');
		if(sreq.length){
			var visible = (sreq.data('required') && !disabled) ? "visible" : "hidden";
			sreq.css('visibility', visible)
		}
	}
}*/

/*//清空validation
function clearElementValidation(element, group, container){
	//add by hxiao
	var $field = $(element);
	var field = $field.attr('name');
    group     = group || '.form-group';
    container = container || 'popover';
    //清空消息
    if($field.data('bv.messages')){
    	$field.data('bv.messages').find('.help-block[data-bv-validator][data-bv-for="' + field + '"]').remove().end()
    	.end()
    	.removeData('bv.messages')
    	// Remove feedback classes
    	// .parents(group)
    	//     .removeClass('has-feedback has-error has-success')
    	//     .end()
    	// Turn off events
    	.off('.bv')
    	.removeAttr('data-bv-field');
    	var $parent;
    	if($field.parents(group).length > 1 && $field.parentsUntil('.no-mp-group',group).length == 1){
    		$parent = $field.parentsUntil('.no-mp-group',group);
    	}else{
    		$parent = $field.parents(group);
    	}
    	$parent.removeClass('has-feedback has-error has-success');
    	// Remove feedback icons, tooltip/popover container
    	$icon = $field.parents(group).find('i[data-bv-icon-for="' + field + '"]');
    	if ($icon) {
    		switch (container) {
    		case 'tooltip':
    			$icon.tooltip('destroy').remove();
    			break;
    		case 'popover':
    			$icon.popover('destroy').remove();
    			break;
    		default:
    			$icon.remove();
    		break;
    		}
    	}
    }
}*/
/*// 判断是否为空
function isEmpty(str){
	if(str == null){
		return true;
	}else if(str == "undefined"){
		return true;
	}else if(str == "null"){
		return true;
	}else if(str == ""){
		return true;
	}else if(str instanceof String){
		if(str.trim().length == 0){
			return true;
		}
	}else{
		return false;
	}
}*/
//// ajax处理返回消息提示
//// param:ResultBean
//function ajaxBackMsg(data){
//	if(isEmpty(data)||!data.hasOwnProperty('status')||!data.hasOwnProperty('messages')){
//		return error("返回的对象不对！");
//	}
//	if(data['status']){
//		return success(data['messages']);
//	}else{
//		return error(data['messages']);
//	}
//}
//合约期间change事件  add by yangjun
/*function ftdateChange(hideId,ftdateid,resetDiscountInfo_Fun,infoMsg){
	//锁状态，初始化为开锁，因为change事件会在改变日期时触发多次，这里加一个锁，使其只执行一次
	var lockStatus = true;
	$("#" + hideId ).val($('#' + ftdateid).datetimepicker('val'));
	$('#' + ftdateid).datetimepicker().change(function(event){
		if(lockStatus){
			lockStatus = false;
			var newDate = $('#' + ftdateid).datetimepicker('val');
			if(!$("#" + hideId ).val()){
				//改变后的时间
				$("#" + hideId ).val( $('#' + ftdateid).datetimepicker('val'));
				resetDiscountInfo_Fun();
				$('#contract-base').bootstrapValidator('revalidateField', 'signDate');
				lockStatus = true;
			}
			else if($("#" + hideId ).val() && $("#" + hideId ).val() != newDate ){
				var message;
				if(infoMsg){
					message = infoMsg;
				}
				else{
					message = "合约期间改变将清除所有关联的优惠信息和其它信息，是否继续？"
				}
				//注意“lockStatus = true;”这一句千万别提取出来，必须在回调函数中
				confirmExtend(message,function(){
					//改变后的时间
					$("#" + hideId ).val( $('#' + ftdateid).datetimepicker('val'));
					resetDiscountInfo_Fun();
					$('#contract-base').bootstrapValidator('revalidateField', 'signDate');
					lockStatus = true;
				},function(){
					$('#' + ftdateid).datetimepicker('val',$("#" + hideId ).val());
					$('#contract-base').data('bootstrapValidator').resetForm();
			        $('#contract-base').bootstrapValidator('validate');
					lockStatus = true;
				});
			}
			else{
				lockStatus = true;
			}
		}
	})
}*/
/*//合约期间开始时间获取焦点事件  add by xuchuankun
function ftdateOnfocus(ftdateid,predateid){
	$('#' + ftdateid).datetimepicker().focus(function(){
		if($("#" + predateid).datetimepicker('val') == ""){
			warning("请先选择签订日期");
			$('#' + ftdateid).datetimepicker('hide');
		}else{
			$('#' + ftdateid).datetimepicker('setStartDate', $("#" + predateid).datetimepicker('val'));
		}
	})
}*/
//定位到验证失败的元素  add by yangjun 2015年6月13日 15:13:01
/*function invalidElement(){
	var $invalid = $("small[data-bv-result='INVALID']");
	if($invalid.length > 0){
   		var $position = $invalid.eq(0).parent().parent();
   		if($position.length > 0){
   			return $position.offset(); 
   		}
   		return $invalid.eq(0).offset(); 
    }
} */
/*//定位到该元素位置  add by yangjun 2015年6月13日 15:13:01
function scrollOffset(scroll_offset){
	$("body,html").animate({
		scrollTop: scroll_offset.top - 70
		}, 0);
}*/
//强制设置页面显示状态为错误，不过此时的form的validate验证是检测不出这个错误的，所以要在保存时，手动提示 add by yangjun
/*function setErrorStyle(name){
	$("i[data-bv-icon-for='"+name +"']").removeClass("glyphicon-ok").addClass("glyphicon-remove");
	$(".has-success").each(function(){
		if($(this).find("[name="+name+"]")){
			$(this).removeClass("has-success").addClass("has-error");
			return false;
		}
	})
}*/
/*// 禁止enter键、backspace键
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
}; */ 
//添加pop
/*function showPop(id,value){
	$(id).text(value == null ? "" : value);
	$(id).attr('data-content',value == null ? "" : value);
	$(id).popover({trigger: 'hover'});
}*/
// str前补0
/*function numFix(num,len){
	var str = num.toString();
	str = str.replace(".","");
	return (str.length>len)?str:(Array(len-str.length+1).join(0)+str);
}*/
// str后补空格
/*function strFix(str,len){
	return (str.length>len)?str:(str+Array(len-str.length+1).join(' '));
}*/
// 修复IE下new Date参数不能为长字符串的问题
// 日期时间格式必须为2015-10-29 10:30:39
/*function newDateAndTime(dateStr){
	if(dateStr.length <= 10 ){
		return dateStr;
	}
	var ds = dateStr.split(" ")[0].split("-");
	var ts = dateStr.split(" ")[1].split(":");
	var r = new Date();
	r.setFullYear(ds[0],ds[1] - 1, ds[2]);
	r.setHours(ts[0], ts[1], isNaN(ts[2])?'00':ts[2], 0);
	return r;
}
//计算日期间年份差或月份差
function getDifferMonthsOrYears(beginDate,endDate,MonthOrYear){
	var beginDate = new Date(beginDate);
	var b_year = beginDate.getFullYear();
	var b_month = beginDate.getMonth() + 1;
	var b_day = beginDate.getDate();
	var endDate = new Date(endDate);
	var e_year = endDate.getFullYear();
	var e_month = endDate.getMonth() + 1;
	var e_day = endDate.getDate();
	var x_year = e_year - b_year;
	var x_month = e_month - b_month;
	var x_day = e_day - b_day;
	
	var years = 0;
	var months = 0;
	if(MonthOrYear == "Year"){
		years += x_year;
		//将结束日期年份变为开始日期年份再计算相差天数，最后转换成年份
		var e_change_date = new Date((e_year - x_year) + "/" + e_month + "/" + e_day);
		var b_date = new Date(b_year + "/" + b_month + "/" + b_day);
		years += ((e_change_date - b_date)/(1000*3600*24) + 1)/365; 
		return years;
	}
	else if(MonthOrYear == "Month"){
		months += (x_year * 12 + x_month);
		//将结束日期年份和月份变为开始日期年份和月份再计算相差天数，最后转换成月份
		var b_date = new Date(b_year + "/" + b_month + "/" + b_day);
		var e_change_date;
		if(x_day + 1 >= 0 ){
			e_change_date = new Date((e_year - x_year) + "/" + (e_month - x_month) + "/" + (e_day + 1));
			if(x_day >= 0 && new Date((e_year - x_year) + "/" + e_month + "/" + (e_day + 1)).getDate() == b_day){
				months += 1 
			}
			else{
				months += ((e_change_date - b_date)/(1000*3600*24))/30; 
			}
		}
		else{
			e_change_date = new Date((e_year - x_year) + "/" + (e_month - x_month + 1) + "/" + (e_day + 1));
			months = months - 1;
			months += ((e_change_date - b_date)/(1000*3600*24))/30; 
		}
		return months;
	}
}*/
/**
 * 判断是否同时包含字母和数字
 * @param str
 * @returns {Boolean}
 */
/*function checkNumAndLetter(str){
	var containNum = false;
	var containLet = false;
	if (str.search(/[0-9]/) != -1) {  
		containNum = true;
	}
	if (str.search(/[A-Z]/) != -1) {  
		containLet = true; 
	}
	if (str.search(/[a-z]/) != -1) {  
		containLet = true;  
	}
	return containNum && containLet; 
}*/