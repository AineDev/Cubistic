package com.challenge.cubistic;

import java.math.BigDecimal;
import java.util.List;


public class Statistic {
    private BigDecimal sum;
    private BigDecimal avg;
    private BigDecimal max;
    private BigDecimal min;
    private long count;

    public Statistic(List<Transaction> transactions) {
        for (Transaction transaction: transactions) {
            // TODO: only include if it's been within 60 seconds
            BigDecimal currAmount = transaction.getAmount();
            sum.add(currAmount);
            if (max.compareTo(currAmount) == -1){ // TODO: separate out into separate functions
                max = currAmount;
            }
            if (min.compareTo(currAmount) == 1){
                min = currAmount;
            }
        }
        count = transactions.size();
        avg = sum.divide(BigDecimal.valueOf(count));
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
