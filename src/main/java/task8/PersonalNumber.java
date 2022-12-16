package task8;

public class PersonalNumber {

    public static String getSocialNumber(String number) {
        String regex = "\\d+";

        if (number == null || !number.matches(regex)) {
            throw new WrongTypeOfDataException("Incorrect data type");
        } else if (number.length() != 10) {
            throw new IllegalLengthException("Wrong length");
        }
        return number;
    }

    private static class WrongTypeOfDataException extends IllegalArgumentException {
        public WrongTypeOfDataException() {
        }

        public WrongTypeOfDataException(String s) {
            super(s);
        }
    }

    private static class IllegalLengthException extends ArrayIndexOutOfBoundsException {
        public IllegalLengthException() {
        }

        public IllegalLengthException(String s) {
            super(s);
        }
    }
}
