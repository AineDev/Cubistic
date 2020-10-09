package com.challenge.cubistic;

import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionController {
    List<Transaction> transactions = new ArrayList<Transaction>();

    @ExceptionHandler(value = JsonNotParsableException.class)
    @PostMapping("/transactions")
    String newTransaction(@RequestBody Transaction newTransaction) {
        ZonedDateTime now = ZonedDateTime.now();
        if (now.isBefore(newTransaction.getTimestamp())){
            throw new TransactionDateInFutureException();
        } else {
            transactions.add(newTransaction);
            if (within60Seconds(newTransaction, now)){
                return "201";
            } else {
                return "204";
            }
        }
    }

    @GetMapping("/statistics")
    public Statistic statistic() {
        return new Statistic(transactions);
    }

    @DeleteMapping("/transactions")
    String deleteTransactions() {
        transactions.clear();
        return "204";
    }

    /*
   Returns true if the transaction is within 60 seconds of now
    */
    private boolean within60Seconds(Transaction transaction, ZonedDateTime now){
        ZonedDateTime timestamp = transaction.getTimestamp();
        return now.minusMinutes(1).isBefore(timestamp)
                && now.isAfter(timestamp);
    }
}

