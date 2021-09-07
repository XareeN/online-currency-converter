package com.xareen.onlinecurrencyconverter.statement.domain;

import com.xareen.onlinecurrencyconverter.statement.domain.enums.CurrencyCodes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AverageRate {
    private String currency;
    private CurrencyCodes code;
    private BigDecimal mid;
}
