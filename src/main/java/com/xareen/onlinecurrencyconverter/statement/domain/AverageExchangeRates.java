package com.xareen.onlinecurrencyconverter.statement.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AverageExchangeRates {
    private String table;
    private String no;
    private LocalDate effectiveDate;
    private List<AverageRate> rates;
}
