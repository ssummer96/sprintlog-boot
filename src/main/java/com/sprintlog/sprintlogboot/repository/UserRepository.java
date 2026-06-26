package com.sprintlog.sprintlogboot.repository;

import com.sprintlog.sprintlogboot.domain.User;
import org.springframework.data.repository.CrudRepository;

// Spring-Data-JPA
public interface UserRepository extends CrudRepository<User, Long> {
}
