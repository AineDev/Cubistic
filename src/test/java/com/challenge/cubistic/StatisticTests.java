package com.challenge.cubistic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StatisticTests {

    @Test
    public void testStatisticConstructor() {
        ZonedDateTime now = ZonedDateTime.now();
        String includedTransaction = now.minusSeconds(20).toString();

        List<Transaction> testTransactions = new ArrayList<>();
        testTransactions.add(new Transaction("17", includedTransaction));
        testTransactions.add(new Transaction("10", includedTransaction));
        testTransactions.add(new Transaction("20", includedTransaction));
        testTransactions.add(new Transaction("13", includedTransaction));

        Statistic testStatistic = new Statistic(testTransactions);

        assertEquals(testStatistic.setScale(BigDecimal.valueOf(60)), testStatistic.getSum());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(15)), testStatistic.getAvg());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(20)), testStatistic.getMax());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(10)), testStatistic.getMin());
        assertEquals(4, testStatistic.getCount());
    }

    @Test
    public void noTransactionsTest() {
        ZonedDateTime now = ZonedDateTime.now();

        List<Transaction> testTransactions = new ArrayList<Transaction>();
        Statistic testStatistic = new Statistic(testTransactions);

        assertEquals(testStatistic.setScale(BigDecimal.valueOf(0)), testStatistic.getSum());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(0)), testStatistic.getAvg());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(0)), testStatistic.getMax());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(0)), testStatistic.getMin());
        assertEquals(0, testStatistic.getCount());
    }

    @Test
    public void testOutDatedTransactions() {
        ZonedDateTime now = ZonedDateTime.now();
        String includedTransaction =  now.minusSeconds(20).toString();
        String excludedTransaction =  now.minusSeconds(80).toString();

        List<Transaction> testTransactions = new ArrayList<Transaction>();
        testTransactions.add(new Transaction("17", includedTransaction));
        testTransactions.add(new Transaction("10", includedTransaction));
        testTransactions.add(new Transaction("20", includedTransaction));
        testTransactions.add(new Transaction("13", includedTransaction));
        testTransactions.add(new Transaction("11113", excludedTransaction));

        Statistic testStatistic = new Statistic(testTransactions);

        assertEquals(testStatistic.setScale(BigDecimal.valueOf(60)), testStatistic.getSum());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(15)), testStatistic.getAvg());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(20)), testStatistic.getMax());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(10)), testStatistic.getMin());
        assertEquals(4, testStatistic.getCount());
    }

    @Test
    public void testOneTransaction() {
        ZonedDateTime now = ZonedDateTime.now();
        String includedTransaction =  now.minusSeconds(20).toString();

        List<Transaction> testTransactions = new ArrayList<Transaction>();
        testTransactions.add(new Transaction("17", includedTransaction));

        Statistic testStatistic = new Statistic(testTransactions);

        assertEquals(testStatistic.setScale(BigDecimal.valueOf(17)), testStatistic.getSum());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(17)), testStatistic.getAvg());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(17)), testStatistic.getMax());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(17)), testStatistic.getMin());
        assertEquals(1, testStatistic.getCount());
    }

    @Test
    public void testNegativeAmounts() {
        ZonedDateTime now = ZonedDateTime.now();
        String includedTransaction =  now.minusSeconds(20).toString();

        List<Transaction> testTransactions = new ArrayList<Transaction>();
        testTransactions.add(new Transaction("-17", includedTransaction));
        testTransactions.add(new Transaction("-20", includedTransaction));
        testTransactions.add(new Transaction("-8", includedTransaction));

        Statistic testStatistic = new Statistic(testTransactions);

        assertEquals(testStatistic.setScale(BigDecimal.valueOf(-45)), testStatistic.getSum());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(-15)), testStatistic.getAvg());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(-8)), testStatistic.getMax());
        assertEquals(testStatistic.setScale(BigDecimal.valueOf(-20)), testStatistic.getMin());
        assertEquals(3, testStatistic.getCount());
    }
}