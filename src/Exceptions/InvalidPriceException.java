package Exceptions;

public class InvalidPriceException extends Exception {
    public InvalidPriceException(double price) {
        super("Invalid price " + price);
    }
}
