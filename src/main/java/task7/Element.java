package task7;

public class Element {

    public static double getElement(double value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        } else {
            return Math.sqrt(value);
        }
    }
}