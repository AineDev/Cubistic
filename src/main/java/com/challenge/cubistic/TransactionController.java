package com.challenge.cubistic;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @PostMapping("/transactions")
    Transaction transaction(@RequestBody Transaction newTransaction) {
        // TODO: return status codes
        // TODO: save transaction somewhere? Cache?
        return newTransaction;
    }

    @DeleteMapping("/transactions")
    void deleteTransactions() {
        // TODO: delete all transactions, return 204 status code
        // TODO: Decide if anything should happen with Statistic
    }
}

