package by.belhard.j18.les8.try1.exceptions;

public class InvalidFuelParameterException extends RuntimeException {
    public InvalidFuelParameterException(String s) {
        System.err.println(s);
    }
}
