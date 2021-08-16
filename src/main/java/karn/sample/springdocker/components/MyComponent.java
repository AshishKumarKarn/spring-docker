package karn.sample.springdocker.components;

import javax.inject.Named;

@Named
public class MyComponent {

    public String invoke() {
        return "invoked";
    }
}
