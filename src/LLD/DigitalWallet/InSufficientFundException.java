package LLD.DigitalWallet;

public class InSufficientFundException extends RuntimeException{
    public InSufficientFundException(String message) {
        super(message);
    }
}
