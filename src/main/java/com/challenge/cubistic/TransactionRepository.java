package com.challenge.cubistic;

import java.math.BigDecimal;

public interface TransactionRepository {

    Transaction getByAmount(BigDecimal amount);
}
