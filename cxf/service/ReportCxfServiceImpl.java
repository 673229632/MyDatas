package com.gcsoft.pdqcreport.cxf.service;

import com.alibaba.fastjson.JSON;
import com.gcsoft.pdqcreport.common.utils.Tools;
import com.gcsoft.pdqcreport.pdreportcnrds.form.ReportConditionForm;
import com.gcsoft.pdqcreport.pdreportcnrds.service.MainPdReportCnrdsService;
import com.gcsoft.pdqcreport.pdreportcnrds.util.PdReportUtils;
import com.ustcsoft.marsfw.web.servlet.method.ret.json.jackson.JacksonCountReturn;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//对外发布的服务名
//指定你想要的名称空间，通常使用使用包名反转
//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口doPdreportcnrds
@WebService(serviceName = "ReportCxfService",
        targetNamespace = "http://service.cxf.pdqcreport.gcsoft.com",
        endpointInterface = "com.gcsoft.pdqcreport.cxf.service.ReportCxfService")
@Component
public class ReportCxfServiceImpl implements ReportCxfService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private BasicCookieStore cookieStore;

    private CloseableHttpClient httpclient;

    @Autowired
    private MainPdReportCnrdsService mainPdReportCnrdsService;

    // 客户端调用线程池
    private static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    // 执行上报的线程池
    private static final ExecutorService doReportThreadPool = Executors.newFixedThreadPool(3);

    @Override
    public JacksonCountReturn doPdreportcnrds(String sConidtion) {
        /*logger.info("参数:{}", sConidtion);
        final JacksonCountReturn[] result = {null};
        cachedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                result[0] = doWayThread(sConidtion);
            }
        });
        return result[0];*/
        return doWayThread(sConidtion);
    }


    public JacksonCountReturn doWayThread(String sConidtion) {
        JacksonCountReturn result = new JacksonCountReturn();
        // logger.info("客户端[{}]调用接口!", Tools.getClientIP());
        try {
            ReportConditionForm conditionForm = JSON.parseObject(sConidtion, ReportConditionForm.class);

            // 是否登录标记
            boolean isLogin = false;
            cookieStore = new BasicCookieStore();
            httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();

            isLogin = PdReportUtils.login(httpclient, cookieStore, conditionForm.getLoginName(),
                    conditionForm.getLoginPsw());
            if (isLogin) {
                result.setSuccessCount(1);
                result.setRetMsg("开始上报信息...");

                doReportThreadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        mainPdReportCnrdsService.startReportcnrds(httpclient, sConidtion);
                    }
                });

            } else {
                result.setSuccessCount(0);
                result.setRetMsg("登录失败,请检查用户名或密码是否正确!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccessCount(0);
            result.setRetMsg("接口异常!");
            return result;
        }
        return result;
    }

}
