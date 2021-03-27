package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    Double rate=2.0;
    CurrencyType type=CurrencyType.US_DOLLAR;

    public Double convert(CurrencyType currencyType) {
        Double endCurrency=currencyType.getRate();
        Double conversionRate=endCurrency/type.getRate();
        return conversionRate;
    }

    public CurrencyType g(){return type;}
}
