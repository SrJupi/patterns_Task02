package Rates;

public class BRL_Rate implements ExchangeRate {

    @Override
    public float setExchangeRate(float price) {
        return price * 5.15f;
    }
}
