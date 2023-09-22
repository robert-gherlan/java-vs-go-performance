package com.robertg.springbootwebapp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootWebAppApplicationTests {

	@Value(value="${local.server.port}")
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void threadNameShouldReturnAVirtualThreadMatchingString() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/thread/name",
				String.class)).containsPattern("VirtualThread\\[#\\d*\\]\\/runnable@ForkJoinPool-\\d*-worker-\\d*");
	}
}
