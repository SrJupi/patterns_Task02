package observers;

public class RiskNeutral extends AbstractInvestor{

    public RiskNeutral(Broker broker){
        this.broker = broker;
        this.broker.joinInvestor(this);
    }

    @Override
    public void update (float percentage){
        if (percentage < -0.05){
            System.out.println(this.getClass().getSimpleName() + " sells!");
        }else{
            System.out.println("Wow, "+ this.getClass().getSimpleName() + " did not sell");
        }
    }
}
