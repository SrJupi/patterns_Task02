import java.util.Random;

public class CreditCard extends Payment{
    String infoAccount;

    public CreditCard (String infoAccount){
        this.infoAccount = infoAccount;
    }

    @Override
    public PaymentData executePayment() {
        String validationPass;
        int rndNum;
        if (infoAccount.startsWith("34") || infoAccount.startsWith("37")){
            validationPass = "AMEX";
            rndNum = generateRandomValidationNumber();
            validationPass = validationPass + rndNum;
        } else if (infoAccount.charAt(0) == '5'){
            validationPass = "VISA";
            rndNum = generateRandomValidationNumber();
            validationPass = validationPass + rndNum;
        } else {
            validationPass = "CARDNOTACCEPTED";
        }
        return new PaymentData(this.getClass().getSimpleName(), validationPass );
    }

    private int generateRandomValidationNumber() {
        Random rnd = new Random();
        return rnd.nextInt();

    }
}
