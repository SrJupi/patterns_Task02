package Rates;

public class Mar30Rate implements DailyRate{

    @Override
    public float setDailyRate(float price) {
        return price * 5.32f;
    }
}
