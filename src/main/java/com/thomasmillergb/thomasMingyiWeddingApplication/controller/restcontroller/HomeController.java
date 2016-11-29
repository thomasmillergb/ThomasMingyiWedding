package com.thomasmillergb.thomasMingyiWeddingApplication.controller.restcontroller;

import com.thomasmillergb.thomasMingyiWeddingApplication.core.appstate.AppState;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mingyi-PC on 28/11/2016.
 *
 * @author Mingyi-PC
 */
@RestController
@RequestMapping(RestApi.endpointPrefix)
public class HomeController {
    public HomeController() {
    }

    @RequestMapping(value = RestApi.serverStatus, method = RequestMethod.GET)
    public AppState newGame() {
        return AppState.RUNNING;
    }

}
