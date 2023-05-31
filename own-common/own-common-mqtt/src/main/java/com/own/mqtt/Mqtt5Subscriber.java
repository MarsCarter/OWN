package com.own.mqtt;

import org.eclipse.paho.mqttv5.client.IMqttClient;
import org.eclipse.paho.mqttv5.common.MqttException;

public class Mqtt5Subscriber {

    private static final String TOPIC = "test/topic";

    public static void main(String[] args) throws MqttException, InterruptedException {

        IMqttClient client = MqttConnectionUtils.get();

//        client.subscribe(TOPIC, (topic, message) -> {
//            System.out.println("Received message: " + new String(message.getPayload()));
//            System.out.println("Properties: " + message.getProperties());
//        });

        Thread.sleep(10000);

        client.disconnect();
    }
}

