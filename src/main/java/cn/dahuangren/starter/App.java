package cn.dahuangren.starter;

import cn.dahuangren.config.AppConfig;
import com.jfinal.server.undertow.UndertowServer;

public class App {
    public static void main(String[] args) {
        UndertowServer.start(AppConfig.class);
    }
}
