package com.greenfoxacademy.repository;


import com.greenfoxacademy.model.Todo;
import org.hibernate.sql.ordering.antlr.OrderByTranslation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.persistence.OrderBy;
import java.util.List;


public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByOrderByIdAsc();

    List<Todo> findAllByOrderByTitleAsc();

    List<Todo> findByTitleContaining(String keyword);

    List<Todo> findByDoneIsTrue();

    List<Todo> findByDoneIsFalse();

    List<Todo> findByUrgentIsTrue();

    List<Todo> findByUrgentIsFalse();
}

