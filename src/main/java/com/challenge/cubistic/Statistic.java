package com.challenge.cubtistic;

import java.math.BigDecimal;


public class Statistic {
    private BigDecimal sum;
    private BigDecimal avg;
    private BigDecimal max;
    private BigDecimal min;
    private long count;

    public Statistic(BigDecimal sum){
        this.sum = sum;
    } // TODO: finish constructor

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
}
