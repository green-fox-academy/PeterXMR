package com.greeenfoxacademy.Repository;

import com.greeenfoxacademy.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
