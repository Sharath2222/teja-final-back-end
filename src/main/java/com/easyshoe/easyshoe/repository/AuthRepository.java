package com.easyshoe.easyshoe.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.easyshoe.easyshoe.model.User;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

}
