package com.seungwoo.app.repository;

import com.seungwoo.app.domian.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Long> {
}
