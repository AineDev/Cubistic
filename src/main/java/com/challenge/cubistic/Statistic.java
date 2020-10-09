package com.challenge.cubistic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.util.List;


public class Statistic {
    private BigDecimal sum;
    private BigDecimal avg;
    private BigDecimal max;
    private BigDecimal min;
    private long count;

    public Statistic(List<Transaction> transactions) {
        ZonedDateTime now = ZonedDateTime.now();
        BigDecimal sum = BigDecimal.valueOf(0);
        BigDecimal max = BigDecimal.valueOf(0);
        BigDecimal min = BigDecimal.valueOf(0);
        long count = 0;
        BigDecimal avg = BigDecimal.valueOf(0);
        for (Transaction transaction: transactions) {
            if (within60Seconds(transaction, now)){
                BigDecimal currAmount = transaction.getAmount();
                sum = sum.add(currAmount);
                if (max.compareTo(currAmount) < 0 | (count == 0)){
                    max = currAmount;
                }
                if ((min.compareTo(currAmount) > 0) | (count == 0)){
                    min = currAmount;
                }
                count += 1;
            }
        }
        if (count != 0){
            avg = sum.divide(BigDecimal.valueOf(count), RoundingMode.HALF_UP);
        }
        this.avg = setScale(avg);
        this.sum = setScale(sum);
        this.max = setScale(max);
        this.min = setScale(min);
        this.count = count;
    }

    public BigDecimal setScale(BigDecimal amount){
        return amount.setScale(2, RoundingMode.CEILING);
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

    /*
    Returns true if the transaction is within 60 seconds of now
     */
    private boolean within60Seconds(Transaction transaction, ZonedDateTime now){
        ZonedDateTime timestamp = transaction.getTimestamp();
        return now.minusMinutes(1).isBefore(timestamp)
                && now.isAfter(timestamp);
    }
}
