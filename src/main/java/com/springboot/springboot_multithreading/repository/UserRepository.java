package com.springboot.springboot_multithreading.repository;

import com.springboot.springboot_multithreading.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
