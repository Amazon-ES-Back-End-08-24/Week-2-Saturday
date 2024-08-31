package classes;

public class MethodExercise {
    public static void executeMethodExercise() {
        int num1 = 10;
        int num2 = 5;
        double num3 = 10.12;
        double num4 = 5.91;

        System.out.println("Sum with int " + add(num1, num2));
        System.out.println("Subtract with int " + subtract(num1, num2));
        System.out.println("Multiply with int " + multiply(num1, num2));
        System.out.println("Divide with int " + divide(num1, num2));


        System.out.println("Sum with double " + add(num3, num4));
        System.out.println("Subtract with double " + subtract(num3, num4));
        System.out.println("Multiply with double " + multiply(num3, num4));
        System.out.println("Divide with double " + divide(num3, num4));

        System.out.println("----- TESTING VALIDATIONS ------");

        System.out.println("Sum with negative int " + add(-1, num2));
        System.out.println("Subtract with negative  int " + subtract(-2, -91));
        System.out.println("Multiply with negative  int " + multiply(num1, -83));
        System.out.println("Divide with zero  int " + divide(num1, 0));
        System.out.println("Divide with negative  int " + divide(-31, -1));


        System.out.println("Sum with negative double " + add(-1.31, num3));
        System.out.println("Subtract with negative double " + subtract(-2.01, -91.65));
        System.out.println("Multiply with negative double " + multiply(num4, -83.1));
        System.out.println("Divide with zero double " + divide(num4, 0));
        System.out.println("Divide with negative double " + divide(-31.4, -1.20));

    }

    private static void printNegativeNumberErrorMessage() {
        System.out.println("Error: Cannot receive negative numbers");
    }

    private static void printZeroErrorMessage() {
        System.out.println("Error: Cannot divide by zero");
    }

    private static boolean isNegative(int number1, int number2) {
        return number1 < 0 || number2 < 0;
    }

    private static boolean isNegative(double number1, double number2) {
        return number1 < 0 || number2 < 0;
    }

    private static int add(int number1, int number2) {
        if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();
            return 0;
        }
        return number1 + number2;
    }

    private static int subtract(int number1, int number2) {
        if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();
            return 0;
        }
        return number1 - number2;
    }

    private static int multiply(int number1, int number2) {
        if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();
            return 0;
        }
        return number1 * number2;
    }

    private static int divide(int number1, int number2) {
        if (number2 == 0) {
            printZeroErrorMessage();
            return 0;
        } else if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();

            return 0;
        }
        return number1 / number2;
    }

    // sobrecarga
    private static double add(double number1, double number2) {
        if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();

            return 0;
        }
        return number1 + number2;
    }

    private static double subtract(double number1, double number2) {
        if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();
            return 0;
        }
        return number1 - number2;
    }

    private static double multiply(double number1, double number2) {
        if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();
            return 0;
        }
        return number1 * number2;
    }

    private static double divide(double number1, double number2) {
        if (number2 == 0) {
            printZeroErrorMessage();
            return 0;
        } else if (isNegative(number1, number2)) {
            printNegativeNumberErrorMessage();
            return 0;
        }
        return number1 / number2;
    }
}
