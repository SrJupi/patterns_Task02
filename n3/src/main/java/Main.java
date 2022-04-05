import Converters.EuroRealConverter;
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
        EuroRealConverter euroRealConverter = new EuroRealConverter();

        //inject converter for 28/03 rates
        euroRealConverter.setDailyRate(new Mar28Rate());
        euroRealConverter.getRealPrices(shoe);
        euroRealConverter.getRealPrices(tShirt);
        System.out.println();

        //inject converter for 30/03 rates
        euroRealConverter.setDailyRate(new Mar30Rate());
        euroRealConverter.getRealPrices(shoe);
        euroRealConverter.getRealPrices(tShirt);
        System.out.println();


        //inject converter for 01/04 rates
        euroRealConverter.setDailyRate(new Apr01Rate());
        euroRealConverter.getRealPrices(shoe);
        euroRealConverter.getRealPrices(tShirt);

    }
}
