package com.challenge.cubistic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionTests {

    @Test
    public void testTransactionConstructor() {
        Transaction testTransaction = new Transaction("73.35", "2018-07-17T09:59:51.312Z");


        // TODO: uncomment out tests once functions are implemented
        // basic example
//        assertEquals(73.35, testTransaction.getAmount(), "amount should be 73.35");
//        assertEquals("2018-07-17T09:59:51.312Z", testTransaction.getTimestamp(), "timestamp should be 2018-07-17T09:59:51.312Z");
//
//        // Truncate amount,
//        Transaction testTransactionLongerAmount = new Transaction("74.916", "2018-07-17T09:59:51.312Z");
//        assertEquals(74.91, testTransaction.getAmount(), "amount should be 73.35");
//
//        // Truncate amount, rounded up
//        Transaction testTransactionRoundedUp = new Transaction("74.986", "2018-07-17T09:59:51.312Z");
//        assertEquals(74.99, testTransaction.getAmount(), "amount should be 73.35");
//
//        // Negitive Amount
//        Transaction testTransactionNegitiveAmount = new Transaction("-74.98", "2018-07-17T09:59:51.312Z");
//        assertEquals(74.98, testTransaction.getAmount(), "amount should be 73.35");
    }
}
