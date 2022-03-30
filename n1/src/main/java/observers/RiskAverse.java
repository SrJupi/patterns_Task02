package observers;

public class RiskAverse extends AbstractInvestor{

    public RiskAverse (Broker broker){
        this.broker = broker;
        this.broker.joinInvestor(this);
    }

    @Override
    public void update (float percentage){
        if (percentage < -0.01){
            System.out.println(this.getClass().getSimpleName() + " sells");
            //.broker.removeInvestor(this);
        }else{
            System.out.println("Wow, "+ this.getClass().getSimpleName() + " did not sell");
        }

    }
}
