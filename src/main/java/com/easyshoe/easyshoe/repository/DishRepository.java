package com.easyshoe.easyshoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyshoe.easyshoe.model.product;

@Repository
public interface DishRepository extends JpaRepository<product,Long> {
}
