package com.challenge.cubistic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TransactionTests {

    @Test
    public void testTransactionConstructor() {
        Transaction testTransaction = new Transaction("73.35", "2018-07-17T09:59:51.312Z");



        // TODO: uncomment out tests once functions are implemented
        // basic example

        assertEquals(BigDecimal.valueOf(73.35), testTransaction.getAmount(), "amount should be 73.35");
        assertEquals(ZonedDateTime.parse("2018-07-17T09:59:51.312Z"), testTransaction.getTimestamp(), "timestamp should be 2018-07-17T09:59:51.312Z");

        // Truncate amount
        Transaction testTransactionLongerAmount = new Transaction("74.916", "2018-07-17T09:59:51.312Z");
        assertEquals(BigDecimal.valueOf(74.92), testTransactionLongerAmount.getAmount());

        // Truncate amount, rounded up
        Transaction testTransactionRoundedUp = new Transaction("74.985", "2018-07-17T09:59:51.312Z");
        assertEquals(BigDecimal.valueOf(74.99), testTransactionRoundedUp.getAmount());

        // Added Zero
        Transaction testTransactionAdd0 = new Transaction("13.9", "2018-07-17T09:59:51.312Z");
        assertEquals(BigDecimal.valueOf(13.90).setScale(2, RoundingMode.CEILING), testTransactionAdd0.getAmount());

        // Negative Amount
        Transaction testTransactionNegativeAmount = new Transaction("-74.98", "2018-07-17T09:59:51.312Z");
        assertEquals(BigDecimal.valueOf(-74.98), testTransactionNegativeAmount.getAmount());
    }
}
