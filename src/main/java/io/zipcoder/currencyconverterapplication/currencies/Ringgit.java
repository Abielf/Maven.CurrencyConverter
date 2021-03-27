package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    Double rate=8.94;
    CurrencyType type=CurrencyType.RINGGIT;

    public Double convert(CurrencyType currencyType) {
        Double endCurrency=currencyType.getRate();
        Double conversionRate=endCurrency/ type.getRate();
        return conversionRate;
    }

    public CurrencyType g(){return type;}
}
