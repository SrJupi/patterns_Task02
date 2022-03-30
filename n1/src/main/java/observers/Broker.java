package observers;

import java.util.ArrayList;
import java.util.Random;

public class Broker {

    private ArrayList <AbstractInvestor> investors = new ArrayList<>();
    private int stockValue;
    private Random rand = new Random(1000);

    public Broker (int initialValue){
        setStockValue(initialValue);
    }

    public void setStockValue (int initialValue) {
        this.stockValue = initialValue;
    }

    public int getStockValue (){
        return  stockValue;
    }

    public void startNewDay(){
        System.out.println("*** New Day ***");
        System.out.println("Current stock value: " + stockValue);
        int dailyVariation = rand.nextInt(-750, 100);
        float percentageVariation = (float) dailyVariation / stockValue;
        stockValue = stockValue + dailyVariation;
        System.out.println("Day change: "+ dailyVariation);
        System.out.println("Percentage change: " + percentageVariation);
        notifyChangeStock(percentageVariation);
    }


    public void joinInvestor (AbstractInvestor newInvestor) {
        investors.add(newInvestor);
    }

    public void notifyChangeStock (float percentage) {
        for (AbstractInvestor investor :
                investors) {
            investor.update(percentage);
        }
    }

}
