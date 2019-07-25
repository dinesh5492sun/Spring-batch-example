package com.test.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
