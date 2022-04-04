import java.util.Optional;

public abstract class Payment {

    PaymentData executeWith (Callback callback){
        PaymentData returnedData = executePayment();
        Optional.ofNullable(callback).ifPresent(Callback::call);
        return returnedData;

    }
    public abstract PaymentData executePayment();
}
