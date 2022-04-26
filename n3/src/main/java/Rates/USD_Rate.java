package Rates;

public class USD_Rate implements ExchangeRate {

    @Override
    public float setExchangeRate(float price) {
        return price * 1.07f;
    }
}
