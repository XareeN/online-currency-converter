package com.xareen.onlinecurrencyconverter.statement.domain;

import com.xareen.onlinecurrencyconverter.domain.TableOfRates;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class TurnoverExchangeRates extends TableOfRates {
    private LocalDate tradingDate;
    private Set<TurnoverRate> rates;
}
