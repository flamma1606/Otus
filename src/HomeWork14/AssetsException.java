package HomeWork14;

public class AssetsException extends Exception {
    private final int amount;

    public int getNumber(){return amount;}

    public AssetsException(String message, int num) {
        super(message);
        amount=num;
    }

}
