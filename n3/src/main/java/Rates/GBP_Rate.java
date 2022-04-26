package Rates;

public class GBP_Rate implements ExchangeRate {

    @Override
    public float setExchangeRate(float price) {
        return price * 0.84f;
    }
}
