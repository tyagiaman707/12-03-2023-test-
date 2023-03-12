package com.example.Deployment.Assignment.repository;

import com.example.Deployment.Assignment.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data,Integer> {
}
