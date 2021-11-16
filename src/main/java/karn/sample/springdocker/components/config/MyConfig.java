package karn.sample.springdocker.components.config;

import karn.sample.springdocker.components.MyComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Configuration
@Slf4j
public class MyConfig {

    @Inject
    @Bean("names")
    public List<String> getNames(@Named("someId") MyComponent component){
        log.info("MyConfig invoked");
        return Arrays.asList("Ashish", "Sukanya", "Aditya", component.getName());
    }
}
