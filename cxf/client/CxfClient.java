package com.gcsoft.pdqcreport.cxf.client;

import com.alibaba.fastjson.JSON;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @author zhangrui
 * @ClassName:CxfClient
 * @Description:webservice客户端： 该类提供调用webservice服务
 * 动态调用webservice
 */
public class CxfClient {


    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            int finalI = i;
            new Thread("") {
                public void run() {
                    main2(finalI + "");
                }
            }.start();
        }
    }
    /**
     * 动态调用.
     */

    public static void main2(String info) {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://192.168.50.86:8099/services/pdreportcnrds?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        try {
            Object[] objects;
            // invoke("方法名",参数1,参数2,参数3....);
            String sConidtion = "{\'loginName\':\'HBWHYYY\',\'loginPsw\':\'xf2341\',\'year\':\'2018\',\'freq\':\'1\',\'loginUserOrgno\':\'001\',\'ShiYanShiJiFuZhuJianCha\':\'yes\',\'content\':[\'20181\'],\'jsonArrayStr\':[{\'patientid\':\'a1b55ce2e5174dd\',\'cardno\':\'450702198007318427\',\'name\':\'测试二二\',\'sex\':\'男\'}]}";
            objects = client.invoke("doPdreportcnrds", sConidtion);
            System.out.println("返回数据:" + JSON.toJSONString(objects[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}