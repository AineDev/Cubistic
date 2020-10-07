package com.challenge.cubistic;

import java.math.BigDecimal;


public class Statistic {
    private BigDecimal sum;
    private BigDecimal avg;
    private BigDecimal max;
    private BigDecimal min;
    private long count;

    public Statistic() {
    }

    public Statistic(BigDecimal sum, BigDecimal avg, BigDecimal max, BigDecimal min,
                     long count){
        this.sum = sum;
        this.avg = avg;
        this.max = max;
        this.min = min;
        this.count = count;
    }

    public BigDecimal getSum() {
        return sum;
    }
    public BigDecimal getAvg() {
        return avg;
    }

    public BigDecimal getMax() {
        return max;
    }

    public BigDecimal getMin() {
        return min;
    }

    public long getCount() {
        return count;
    }

//    // Returns statisics computed on the transactions within the last 60
//    // seconds.
//    public Statistic getRecentTransactions() { // TODO: return correct statistic
//        return new Statistic(1, BigDecimal.valueOf(34),
//                BigDecimal.valueOf(17),
//                BigDecimal.valueOf(18),
//                BigDecimal.valueOf(16),
//                2, "sup");
//    }
}
