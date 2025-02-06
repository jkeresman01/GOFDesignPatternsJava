package com.keresman.gof.facade;

import java.math.BigDecimal;

public class DatabaseService {

    public User getUserById(long id) {
        return new User(
                id,
                "Milica",
                "Krmpotic",
                new BigDecimal("123123.23"),
                "EUR",
                "000-123123-123123");
    }
}
