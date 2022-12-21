package org.apache.camel.example.spring;

import model.Employee;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.example.spring.processor.EmployeeProcessor;

import javax.xml.bind.JAXBContext;

public class EmployeeRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //XML data format
        JaxbDataFormat xmlDataFormat = new JaxbDataFormat();
        JAXBContext con = JAXBContext.newInstance(Employee.class);
        xmlDataFormat.setContext(con);

        //JSON data format

        JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Employee.class);

//        from("file:src/empData?noop=true").doTry().unmarshal(jsonDataFormat).process(
//                new EmployeeProcessor()).marshal(xmlDataFormat).to("jms:queue:marshallUnmarshallDemo").doCatch(Exception.class)
//                .process(exchange -> {
//                    Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT,Exception.class);
//                    System.out.println(cause);
//                });


        from("file:src/empData?noop=true").doTry().unmarshal(jsonDataFormat).marshal(xmlDataFormat)
                .to("jms:queue:marshallUnmarshallDemo").doCatch(Exception.class)
                .process(exchange -> {
                    Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT,Exception.class);
                    System.out.println(cause);
                });
    }
}
