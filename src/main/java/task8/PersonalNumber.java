package task8;

public class PersonalNumber {

    public static String getSocialNumber(String number) {
        String regex = "\\d+";
        if (number == null || !number.matches(regex)) {
            throw new IllegalArgumentException("Incorrect data type");
        } else if (number.length() != 10) {
            throw new ArrayIndexOutOfBoundsException("Wrong length");
        }
        return number;
    }
}
