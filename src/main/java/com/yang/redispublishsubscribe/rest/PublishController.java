package com.yang.redispublishsubscribe.rest;

import com.yang.redispublishsubscribe.config.RedisSubscriber;
import com.yang.redispublishsubscribe.config.RedisPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yang
 * @date: 2018/10/9 23:02
 * @description:
 */
@RestController
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    private RedisPublisher redisPublisher;

    @GetMapping("/push")
    public Object publish(String message) {
        this.redisPublisher.sendChannelMess(RedisSubscriber.TOPIC, message);
        return "success";
    }

}
