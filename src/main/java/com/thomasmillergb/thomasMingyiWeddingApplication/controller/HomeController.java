package com.thomasmillergb.thomasMingyiWeddingApplication.controller;

import com.thomasmillergb.thomasMingyiWeddingApplication.core.appstate.AppState;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mingyi-PC on 28/11/2016.
 *
 * @author Mingyi-PC
 */
public class HomeController {
    public HomeController() {
    }

    @RequestMapping(value = RestApi.home, method = RequestMethod.GET)
    public AppState newGame() {
        return AppState.RUNNING;
    }
}
