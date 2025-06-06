package br.com.mardev.list_todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mardev.list_todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
