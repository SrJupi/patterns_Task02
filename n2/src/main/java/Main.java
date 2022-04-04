import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gateway gateway = new Gateway();
        ArrayList <PaymentData> paymentsList = new ArrayList<>();
        paymentsList.add(gateway.makePayment(new CreditCard("5")));
        paymentsList.add(gateway.makePayment(new CreditCard("34")));
        paymentsList.add(gateway.makePayment(new PayPal("email@email.com")));
        paymentsList.add(gateway.makePayment(new PayPal("random@email.com")));
        paymentsList.add(gateway.makePayment(new BankDeposit("ES2031903672902633883999")));
        paymentsList.add(gateway.makePayment(new BankDeposit("ES0414657567141595724447")));



        for (PaymentData pay :
                paymentsList) {
            System.out.println(pay.getPaymentMethod() + " - " + pay.getValidationNumber());
        }


    }
}
