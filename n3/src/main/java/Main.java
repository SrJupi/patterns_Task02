import Converters.EuroConverter;
import Rates.*;

public class Main {

    public static void main(String[] args) {
        //create "items"
        float shoe = 29.95f;
        float tShirt = 19.95f;
        System.out.println("Euro prices of shoe: " + shoe);
        System.out.println("Euro prices of t-shirt: " + tShirt);
        System.out.println();

        //create Converters.EuroRealConverter
        EuroConverter euroConverter = new EuroConverter();

        //inject converter BRL_Rate
        euroConverter.setExchangeRate(new BRL_Rate());
        euroConverter.getConvertedPrices(shoe);
        euroConverter.getConvertedPrices(tShirt);
        System.out.println();

        //inject converter for USD_Rate
        euroConverter.setExchangeRate(new USD_Rate());
        euroConverter.getConvertedPrices(shoe);
        euroConverter.getConvertedPrices(tShirt);
        System.out.println();


        //inject converter for GBP_Rate
        euroConverter.setExchangeRate(new GBP_Rate());
        euroConverter.getConvertedPrices(shoe);
        euroConverter.getConvertedPrices(tShirt);

    }
}
