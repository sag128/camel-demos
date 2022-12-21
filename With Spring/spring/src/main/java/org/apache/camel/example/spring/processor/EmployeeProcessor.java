package org.apache.camel.example.spring.processor;

import model.Employee;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class EmployeeProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Employee emp = exchange.getIn().getBody(Employee.class);
        emp.setDesignation("SE");
        emp.setName("SAgar");
        emp.setSalary(100000);
        exchange.getIn().setBody(emp);
    }
}
