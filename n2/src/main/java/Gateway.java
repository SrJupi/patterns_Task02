public class Gateway {

    public PaymentData makePayment (Payment payment){

        return payment.executeWith(()-> System.out.println("Payment Concluded"));
    }
}
