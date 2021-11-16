package karn.sample.springdocker.components;

import lombok.Getter;

import javax.inject.Named;

@Named("someId")
@Getter
public class MyComponent {
private String name;


    public String getName() {
        return name+" custom";
    }

    public String invoke() {
        return "invoked";
    }
}
@Named
class MyComponent2 extends MyComponent{
    @Override
    public String invoke() {
        return "component2 invoked";
    }
}
