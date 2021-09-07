package com.xareen.onlinecurrencyconverter.statement.domain;

import com.xareen.onlinecurrencyconverter.domain.RateCore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class TurnoverRate extends RateCore {
    private BigDecimal bid;
    private BigDecimal ask;
}
