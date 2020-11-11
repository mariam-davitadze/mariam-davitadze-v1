package ge.btu.currency;

public interface CurrencyService{
    void setExchangeRate(float value);
    float convert(float amount);
}
