package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Insurence;
@Repository
public interface InsurenceRepository extends JpaRepository<Insurence, Long> {

}
