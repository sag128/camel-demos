package com.codeusingjava;


import javax.jms.ConnectionFactory;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.component.direct.DirectComponent;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import com.codeusingjava.route.JMSRouteBuilder;

public class CamelMain {

	public static void main(String[] args) {
		CamelContext ctx = new DefaultCamelContext();


		JMSRouteBuilder jmsRouteBuilder = new JMSRouteBuilder();

		try {
			ctx.addRoutes(jmsRouteBuilder);
			ctx.start();
			Thread.sleep(5 * 60 * 1000);
			ctx.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}