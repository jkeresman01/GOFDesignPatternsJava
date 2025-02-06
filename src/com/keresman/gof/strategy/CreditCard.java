package com.keresman.gof.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CreditCard(
        Long id,
        BigDecimal balance,
        String accountNo,
        LocalDateTime date,
        String cvv
) { }
