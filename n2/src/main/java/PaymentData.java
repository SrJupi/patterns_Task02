public class PaymentData {
    private String paymentMethod;
    private String validationPass;

    public PaymentData (String paymentMethod, String validationPass){
        this.paymentMethod = paymentMethod;
        this.validationPass = validationPass;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getValidationNumber() {
        return validationPass;
    }
}
