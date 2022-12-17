package task8;

public class PersonalNumber {

    public static void validateSocialNumber(String number) {
        String regex = "\\d+";

        if (number == null || !number.matches(regex)) {
            throw new WrongTypeOfDataException("Incorrect data type");
        } else if (number.length() != 10) {
            throw new IllegalLengthException("Wrong length");
        }

    }

    private static class WrongTypeOfDataException extends IllegalArgumentException {
        public WrongTypeOfDataException(String message) {
            super(message);
        }
    }

    private static class IllegalLengthException extends RuntimeException {
        public IllegalLengthException(String message) {
            super(message);
        }
    }
}
