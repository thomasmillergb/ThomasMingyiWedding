package com.thomasmillergb.thomasMingyiWeddingApplication.controller.jspcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Thomas Miller on 29/11/2016.
 *
 * @author Thomas Miller
 */
@Controller
public class JspController {

    @RequestMapping("/")
    public String jsptest(ModelAndView modelAndView) {
        return "jsp-spring-boot";
    }
}
