package com.greenfox.todo.Repository;

import com.greenfox.todo.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository <Message,Long> {
}
