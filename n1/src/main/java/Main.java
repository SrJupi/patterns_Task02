import observers.Broker;
import observers.RiskAverse;
import observers.RiskLoving;
import observers.RiskNeutral;

public class Main {

    public static void main(String[] args) {
        Broker broker = new Broker(10000);

        new RiskAverse(broker);
        new RiskNeutral(broker);
        new RiskLoving(broker);

        for (int i = 0; i < 2; i++) {
            broker.startNewDay();
        }


    }
}
