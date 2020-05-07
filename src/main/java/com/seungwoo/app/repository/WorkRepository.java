package com.seungwoo.app.repository;

import com.seungwoo.app.domian.Work;
import org.springframework.data.repository.CrudRepository;

public interface WorkRepository extends CrudRepository<Work, Long> {
}
