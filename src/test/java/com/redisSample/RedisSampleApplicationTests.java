package com.redisSample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootTest
@EnableRedisRepositories
class RedisSampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
