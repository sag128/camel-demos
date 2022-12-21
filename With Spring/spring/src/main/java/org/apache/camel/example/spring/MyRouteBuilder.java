/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.spring;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

/**
 * A simple example router from a file system to an ActiveMQ queue and then to a file system
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Allow this route to be run as an application
     */


    @Override
    public void configure() {

        // populate the message queue with some messages
//        from("file:src/data?noop=true").
//
//                to("jms:queue:test.MyQueue");
//
//        from("jms:queue:test.MyQueue").
//
//                to("jms:queue:test.MyQueue22"). log("${body}");



//        from(jms:queue:test.MyQueue22).
//
//                 to("direct:data1").log("${body}");
    }

    public static class SomeBean {

        public void someMethod(String body) {
            System.out.println("Received: " + body);
        }
    }

}
