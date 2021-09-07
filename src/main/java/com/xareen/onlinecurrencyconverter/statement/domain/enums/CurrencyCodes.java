package com.xareen.onlinecurrencyconverter.statement.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CurrencyCodes {
    THB("bat (Tajlandia)"),
    USD("dolar amerykański"),
    AUD("dolar australijski"),
    HKD("dolar Hongkongu"),
    CAD("dolar kanadyjski"),
    NZD("dolar nowozelandzki"),
    SGD("dolar singapurski"),
    EUR("euro"),
    HUF("forint (Węgry)"),
    CHF("frank szwajcarski"),
    GBP("funt szterling"),
    UAH("hrywna (Ukraina)"),
    JPY("jen (Japonia)"),
    CZK("korona czeska"),
    DKK("korona duńska"),
    ISK("korona islandzka"),
    NOK("korona norweska"),
    SEK("korona szwedzka"),
    HRK("kuna (Chorwacja)"),
    RON("lej rumuński"),
    BGN("lew (Bułgaria)"),
    TRY("lira turecka"),
    ILS("nowy izraelski szekel"),
    CLP("peso chilijskie"),
    PHP("peso filipińskie"),
    MXN("peso meksykańskie"),
    ZAR("rand (Republika Południowej Afryki)"),
    BRL("real (Brazylia)"),
    MYR("ringgit (Malezja)"),
    RUB("rubel rosyjski"),
    IDR("rupia indonezyjska"),
    INR("rupia indyjska"),
    KRW("won południowokoreański"),
    CNY("yuan renminbi (Chiny)"),
    XDR("SDR (MFW)");

    private final String currency;

}
