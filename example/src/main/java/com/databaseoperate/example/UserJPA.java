package com.databaseoperate.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPA extends JpaRepository<UserEntity,Integer>{
}
