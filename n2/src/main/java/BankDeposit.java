import java.util.Random;

public class BankDeposit extends Payment{
    String infoAccount;

    public BankDeposit(String infoAccount){
        this.infoAccount = infoAccount;
    }

    @Override
    public PaymentData executePayment() {
        String validationPass = infoAccount.substring(0, 4);
        int rndNum = generateRandomValidationNumber();
        validationPass = validationPass + rndNum;

        return new PaymentData(this.getClass().getSimpleName(), validationPass );
    }

    private int generateRandomValidationNumber() {
        Random rnd = new Random();
        return rnd.nextInt();

    }
}
