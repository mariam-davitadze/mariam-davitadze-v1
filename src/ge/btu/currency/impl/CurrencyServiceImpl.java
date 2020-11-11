package ge.btu.currency.impl;
import ge.btu.currency.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService{
    float exchangeRate;

    public void setExchangeRate(float value) {
        exchangeRate = value;
    }

    public float convert(float amount) {
        return amount / exchangeRate;
    }
}
