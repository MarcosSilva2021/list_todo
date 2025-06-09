package br.com.mardev.list_todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.mardev.list_todo.entity.Todo;

@SpringBootTest
class ListTodoApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 01", "desc todo 1", false, 1);
	}

	@Test
	void testCreateTodoFailure() {
	}

}
