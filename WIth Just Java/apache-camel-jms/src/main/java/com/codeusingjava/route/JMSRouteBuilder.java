package com.codeusingjava.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

public class JMSRouteBuilder extends RouteBuilder {

	public JMSRouteBuilder() {


	}

	@Override
	public void configure() throws Exception {
		from("timer:router-2").to("log:router-2");
	}

}