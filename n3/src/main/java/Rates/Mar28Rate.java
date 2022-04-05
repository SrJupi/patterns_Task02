package Rates;

public class Mar28Rate implements DailyRate{

    @Override
    public float setDailyRate(float price) {
        return price * 5.24f;
    }
}
