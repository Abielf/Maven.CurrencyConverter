package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    Double rate=1.86;
    CurrencyType type=CurrencyType.SINGAPORE_DOLLAR;

    public Double convert(CurrencyType currencyType) {
        Double endCurrency=currencyType.getRate();
        Double conversionRate=endCurrency/type.getRate();
        return conversionRate;
    }

    public CurrencyType g(){return type;}
}
