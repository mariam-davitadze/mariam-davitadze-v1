package ge.btu;
import ge.btu.currency.CurrencyService;
import ge.btu.currency.impl.CurrencyServiceImpl;

public class Main {
    public static void main(String[] args) {
        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.setExchangeRate(3);
        System.out.println(currencyService.convert(12));
        System.out.println(currencyService.convert(122.3f));
    }
}
