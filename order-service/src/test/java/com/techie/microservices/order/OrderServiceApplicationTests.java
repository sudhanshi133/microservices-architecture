package com.techie.microservices.order;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@WireMockTest
class OrderServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	// todo there are 2 ways to test this out
	// using mockito or wire mock -this is better because it tests the http call as well

}
