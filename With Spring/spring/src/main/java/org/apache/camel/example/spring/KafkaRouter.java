//package org.apache.camel.example.spring;
//
//import org.apache.camel.builder.RouteBuilder;
//
//public class KafkaRouter extends RouteBuilder {
//    @Override
//    public void configure() throws Exception {
//
//        String topicName = "topic=test";
//        String kafkaServer = "kafka:localhost:9092";
//        String zooKeeperHost = "zookeeperHost=localhost&zookeeperPort=2181";
//        String serializerClass = "serializerClass=kafka.serializer.StringEncoder";
//
//        String toKafka = new StringBuilder().append(kafkaServer).append("?").append(topicName).append("&")
//                .append(zooKeeperHost).append("&").append(serializerClass).toString();
//
//
//        from("file:src/data?noop=true").
//
//                to("kafka:test?brokers=localhost:9092");
//
//        from("kafka:test?brokers=localhost:9092")
//                .log("Message received from Kafka : ${body}")
//                .log("    on the topic ${headers[kafka.TOPIC]}")
//                .log("    on the partition ${headers[kafka.PARTITION]}")
//                .log("    with the offset ${headers[kafka.OFFSET]}")
//                .log("    with the key ${headers[kafka.KEY]}");
//
//    }
//}
