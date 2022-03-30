package observers;

public abstract class AbstractInvestor {
    protected Broker broker;
    public abstract void update (float percentage);
}
