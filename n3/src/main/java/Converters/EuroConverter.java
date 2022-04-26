package Converters;

import Rates.ExchangeRate;

public class EuroConverter {
    private ExchangeRate exchangeRate;

    public EuroConverter(){}

    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void getConvertedPrices (float price)
    {
        String currency = exchangeRate.getClass().getSimpleName().substring(0, 3);
        System.out.printf("Prices on %s: R$ %.2f%n", currency,
                exchangeRate.setExchangeRate(price));
    }
}
