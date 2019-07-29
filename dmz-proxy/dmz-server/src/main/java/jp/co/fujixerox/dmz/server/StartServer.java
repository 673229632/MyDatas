
package jp.co.fujixerox.dmz.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class StartServer extends HttpServlet {

    public static void main(String[] args) {
        DMZServer server = new DMZServer();
        // 线程池NettyServer
        ExecutorService es = Executors.newCachedThreadPool();
        // 启动线程池
        es.execute(server);
    }

}
