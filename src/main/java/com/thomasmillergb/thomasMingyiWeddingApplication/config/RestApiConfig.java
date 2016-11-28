package com.thomasmillergb.thomasMingyiWeddingApplication.config;


import com.thomasmillergb.thomasMingyiWeddingApplication.controller.RestApi;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Thomas Miller
 */
@Configuration
@ComponentScan(basePackages = "com.thomasmillergb.thomasMingyiWeddingApplication.controller")
@RequestMapping(RestApi.endpointPrefix)
public class RestApiConfig {
}