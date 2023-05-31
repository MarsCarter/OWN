package com.own.mqtt;

import org.eclipse.paho.mqttv5.client.IMqttClient;
import org.eclipse.paho.mqttv5.common.MqttException;
import org.eclipse.paho.mqttv5.common.MqttMessage;

public class Mqtt5Publisher {

    private static final String TOPIC = "test/topic";
    private static final String MESSAGE = "Hello, MQTT 5.0!";

    public static void main(String[] args) throws MqttException {

        IMqttClient client = MqttConnectionUtils.get();

        MqttMessage message = new MqttMessage(MESSAGE.getBytes());
        message.setQos(1);
        message.setRetained(false);

//        MqttProperties properties = new MqttProperties();
//        properties.setUserProperties(Arrays.asList(new UserProperty("key1", "value1"),
//                new UserProperty("key2", "value2")));
//        message.setProperties(properties);

        client.publish(TOPIC, message);
//        client.disconnect();
    }
}
