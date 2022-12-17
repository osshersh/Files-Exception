package task9;

public class Numbers {

    public static void validate(int[] values) {

        for (int i = 0; i <= values.length - 1; i++) {
            try {
                checkNumberDivisible(values[i], 3);
            } catch (IllegalArgumentException e) {
                System.out.println(values[i] + " cannot be divide into 3");
            }
        }
    }

    public static void checkNumberDivisible(int value, int divider) {
        if (value % divider != 0) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(value);
        }
    }
}

