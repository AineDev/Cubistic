package com.challenge.cubistic;

import org.springframework.data.jpa.repository.JpaRepository;

 interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
