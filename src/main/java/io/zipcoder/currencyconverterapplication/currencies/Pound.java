package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    Double rate=1.64;
    CurrencyType type=CurrencyType.POUND;

    public Double convert(CurrencyType currencyType) {
        Double endCurrency=currencyType.getRate();
        Double conversionRate=endCurrency/type.getRate();
        return conversionRate;
    }

    public CurrencyType g(){return type;}
}
