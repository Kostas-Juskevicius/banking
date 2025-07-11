package com.kostas.banking.repository;

import com.kostas.banking.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findByAccountNumber(String accountNumber);
    boolean existsByAccountNumber(String accountNumber);
    List<Account> findByOwnerId(UUID ownerId);
    long countByOwnerId(UUID ownerId);
}