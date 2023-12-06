package com.devarantes.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devarantes.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
