package com.zuhlke.f10.account.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Balance {

    private String currency;
    private double amount;
}
