package com.xareen.onlinecurrencyconverter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class TableOfRates {
    protected String table;
    protected String no;
    protected LocalDate effectiveDate;
}
