package com.Paulo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Paulo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
