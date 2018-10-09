package com.yang.redispublishsubscribe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: Yang
 * @date: 2018/10/9 23:08
 * @description:
 */
@Component
public class RedisPublisher {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 向通道发送消息的方法
     *
     * @param channel
     * @param message
     */
    public void sendChannelMess(String channel, String message) {
        stringRedisTemplate.convertAndSend(channel, message);
    }

}
