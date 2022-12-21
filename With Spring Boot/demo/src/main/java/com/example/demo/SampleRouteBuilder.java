package com.example.demo;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:route-1").
                transform().constant("Hello ").

        to("log:route-1").log("${body}");

    }
}
