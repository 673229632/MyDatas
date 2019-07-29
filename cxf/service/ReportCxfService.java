package com.gcsoft.pdqcreport.cxf.service;


import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.cxf.pdqcreport.gcsoft.com")
public interface ReportCxfService {

    @WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    public JacksonCountReturn doPdreportcnrds(@WebParam(name = "sConidtion") String sConidtion);

}
