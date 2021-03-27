package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {

    Double rate=1.0;
    CurrencyType type=CurrencyType.UNIVERSAL_CURRENCY;

    public Double convert(CurrencyType currencyType) {
        Double endCurrency=currencyType.getRate();
        Double conversionRate=endCurrency/type.getRate();
        return conversionRate;
    }

    public CurrencyType g(){return type;}
}
