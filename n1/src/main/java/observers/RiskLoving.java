package observers;

public class RiskLoving extends AbstractInvestor{

    public RiskLoving(Broker broker){
        this.broker = broker;
        this.broker.joinInvestor(this);
    }

    @Override
    public void update (float percentage){
        System.out.println(this.getClass().getSimpleName() + " never sells!");
    }
}
