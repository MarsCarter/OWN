package com.own.mqtt;

import org.eclipse.paho.mqttv5.client.IMqttClient;
import org.eclipse.paho.mqttv5.client.MqttClient;
import org.eclipse.paho.mqttv5.client.MqttClientPersistence;
import org.eclipse.paho.mqttv5.client.MqttConnectionOptions;
import org.eclipse.paho.mqttv5.client.persist.MemoryPersistence;
import org.eclipse.paho.mqttv5.common.MqttException;

public class MqttConnectionUtils {

    private static final String SERVER_URI = "tcp://192.168.0.215:1883";
    private static final String CLIENT_ID = "mqtt5-publisher";

    public static IMqttClient get() throws MqttException {

        MqttClientPersistence persistence = new MemoryPersistence();

        IMqttClient client = new MqttClient(SERVER_URI, CLIENT_ID, persistence);

        // 连接选项
        MqttConnectionOptions connOpts = new MqttConnectionOptions();
        connOpts.setUserName("admin");
        connOpts.setPassword("public123".getBytes());

//        // 保留会话
//        connOpts.setCleanStart(true);
//
//        // 设置回调
//        client.setCallback(new PushCallback());

        // 建立连接
        client.connect(connOpts);

        return client;
    }

}
