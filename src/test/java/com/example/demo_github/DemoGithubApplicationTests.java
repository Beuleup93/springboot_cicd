package com.example.demo_github;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoGithubApplicationTests {

	@Test
	void contextLoads() {
		org.junit.jupiter.api.Assertions.assertEquals(20, 10 + 10,
				"Assertion False"); //Assertion volontairement fausse pour voir l'échec du pipeline
	}

}
