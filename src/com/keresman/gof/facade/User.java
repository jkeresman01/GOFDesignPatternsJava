package com.keresman.gof.facade;

import java.math.BigDecimal;

public record User (
    Long id,
    String name,
    String password,
    BigDecimal balance,
    String currency,
    String accountNo
){};
