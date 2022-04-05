package Converters;

import Rates.DailyRate;

public class EuroRealConverter {
    private DailyRate dailyRate;

    public EuroRealConverter(){}

    public void setDailyRate(DailyRate dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void getRealPrices (float price)
    {
        String month = dailyRate.getClass().getSimpleName().substring(0, 3);
        String day = dailyRate.getClass().getSimpleName().substring(3, 5);
        System.out.printf("Real prices on %s-%s: R$ %.2f%n", month, day,
                dailyRate.setDailyRate(price));
    }
}
