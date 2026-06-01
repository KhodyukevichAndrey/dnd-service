package com.dnd_glory.dnd_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DndServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
