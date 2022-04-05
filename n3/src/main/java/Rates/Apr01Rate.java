package Rates;

public class Apr01Rate implements DailyRate{

    @Override
    public float setDailyRate(float price) {
        return price * 5.15f;
    }
}
