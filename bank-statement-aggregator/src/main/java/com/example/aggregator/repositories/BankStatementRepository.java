// src/main/java/com/example/aggregator/repositories/BankStatementRepository.java
package com.example.aggregator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aggregator.models.BankStatement;

@Repository
public interface BankStatementRepository extends JpaRepository<BankStatement, Long> {
}
