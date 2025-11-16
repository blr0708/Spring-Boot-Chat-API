package com.example.demo;


import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MessageService service;

	@Test
	void testSaveAndFindMessage() {

		Message m = new Message(null, "Test User", "Hello");

		Message saved = service.create(m);

		assertNotNull(saved.getId());

		assertEquals("Test User", saved.getSender());
	}
}