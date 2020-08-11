package com.example.execute.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.execute.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
