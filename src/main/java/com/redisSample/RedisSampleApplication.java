package com.redisSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;




@SpringBootApplication
@EnableRedisRepositories
@ComponentScan(basePackages = "com")
public class RedisSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSampleApplication.class, args);
	}
	@Bean
	LettuceConnectionFactory jedisConnectionFactory(){
		return new LettuceConnectionFactory();
	}
	@Bean
	RedisTemplate redisTemplate(){
		RedisTemplate redisTemplate=new RedisTemplate();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}



}
