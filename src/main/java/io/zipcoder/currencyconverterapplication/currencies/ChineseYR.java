package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    Double rate=13.84;
    CurrencyType type=CurrencyType.CHINESE_YR;

    public Double convert(CurrencyType currencyType) {
        Double endCurrency=currencyType.getRate();
        Double conversionRate=endCurrency/type.getRate();
        return conversionRate;
    }

    public CurrencyType g(){return type;}
}
