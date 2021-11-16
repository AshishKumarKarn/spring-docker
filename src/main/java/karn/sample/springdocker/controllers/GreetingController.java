package karn.sample.springdocker.controllers;

import karn.sample.springdocker.components.MyComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/greeting")
@Slf4j
public class GreetingController {

    @Inject
    @Named("myComponent2")
    private MyComponent myComponent;

    @Inject
    @Named("names")
    private List<String> names;

    @GetMapping
    public String sayHello(@RequestHeader Map<String, String> headers) {
        System.out.println(headers.toString());
        log.info("headers:: {}" , headers);

        log.info("X-Forwarded-For {}", headers.get("X-Forwarded-For"));
        log.info("Invoking myComponent returns {}", myComponent.invoke());
        log.info("names {}",names);
        return "Hello Obj " + this;
    }
}
