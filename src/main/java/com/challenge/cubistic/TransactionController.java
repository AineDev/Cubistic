package com.challenge.cubistic;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionController {
    List<Transaction> transactions = new ArrayList<Transaction>();

    @PostMapping("/transactions")
    Transaction newTransaction(@RequestBody Transaction newTransaction) {
        transactions.add(newTransaction);
        // TODO: return status codes
        return newTransaction;
    }

    @GetMapping("/statistics")
    public Statistic statistic() {
        System.out.println("size of transactions: " + transactions.size());
        if (!transactions.isEmpty()){
            return new Statistic(transactions); // TODO: handle if transactions are empty
        } else {
            throw new TransactionsNotFoundException();
        }
    }

    @DeleteMapping("/transactions")
    void deleteTransactions() {
        transactions.clear();
        return;
        // TODO: delete all transactions, return 204 status code
    }
}

