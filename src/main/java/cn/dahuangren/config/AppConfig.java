package cn.dahuangren.config;

import com.jfinal.config.*;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.template.Engine;

public class AppConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    @Override
    public void configRoute(Routes routes) {
//        routes.scan("cn.dahuangren.controller");
        routes.add(new Routes() {
            @Override
            public void config() {
                this.setBaseViewPath("_view");
                this.addInterceptor(new SessionInViewInterceptor());
                this.scan("cn.dahuangren.controller");

            }
        });
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
