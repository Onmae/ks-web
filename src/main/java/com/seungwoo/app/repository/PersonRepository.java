package com.seungwoo.app.repository;

import com.seungwoo.app.domian.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
