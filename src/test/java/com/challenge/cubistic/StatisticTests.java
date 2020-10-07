package com.challenge.cubtistic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StatisticTests {

    @Test
    public void testStatisticConstructor() {
        BigDecimal sum = new BigDecimal(11);

        Statistic testStatistic = new Statistic(sum);

        assertEquals(sum, testStatistic.getSum());

    }
}
