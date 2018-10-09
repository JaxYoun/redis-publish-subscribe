package com.yang.redispublishsubscribe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author: Yang
 * @date: 2018/10/9 23:35
 * @description:
 */
@Configuration
public class RedisConfig {

    /**
     * 使用默认的工厂初始化redis操作模板
     *
     * @param connectionFactory
     * @return
     */
    @Bean
    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
        return new StringRedisTemplate(connectionFactory);
    }

}
