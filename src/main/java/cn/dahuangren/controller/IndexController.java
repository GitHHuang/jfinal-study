package cn.dahuangren.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path(value = "/", viewPath = "/")
public class IndexController extends Controller {
    public void index() {
        render("index.html");
    }
}
