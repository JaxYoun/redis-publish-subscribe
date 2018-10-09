package com.yang.redispublishsubscribe.config;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @author: Yang
 * @date: 2018/10/9 23:07
 * @description:
 */
@Component
public class RedisSubscriber implements MessageListener {

    public static final String TOPIC = "websocket";

    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println("on message now:" + message);
    }

}
