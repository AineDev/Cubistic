package com.challenge.cubistic;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SimpleTransactionRepository implements TransactionRepository {
    @Override
    @Cacheable("transactions")
    public Transaction getByAmount(BigDecimal amount) {
        return new Transaction(amount, "timestamp");
    }
}


/*

  @Override
  @Cacheable("books")
  public Book getByIsbn(String isbn) {
    simulateSlowService();
    return new Book(isbn, "Some book");
  }

  // Don't do this at home
  private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }

}
 */