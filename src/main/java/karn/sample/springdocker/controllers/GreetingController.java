package karn.sample.springdocker.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1/greeting")
public class GreetingController {

    private static final Log LOGGER = LogFactory.getLog(GreetingController.class);

    @GetMapping
    public String sayHello(@RequestHeader Map<String, String> headers) {
        System.out.println(headers.toString());
        LOGGER.info("headers:: " + headers);
        LOGGER.info("X-Forwarded-For " + headers.get("X-Forwarded-For"));
        return "Hello Obj " + this;
    }
}
