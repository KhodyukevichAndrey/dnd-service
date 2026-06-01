package com.dnd_glory.dnd_service;

import org.springframework.boot.SpringApplication;

public class TestDndServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(DndServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
