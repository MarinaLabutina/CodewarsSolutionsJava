public class Numbers {
    // Formatting decimal places #1
    // https://www.codewars.com/kata/5641c3f809bf31f008000042/solutions/java/me/best_practice
    public static double twoDecimalPlaces(double number) {
        number = number * 100;
        int result;
        if (number < 0) {
            result = (int)Math.ceil(number);
        } else {
            result = (int)Math.floor(number);
        }
        double result1 = result * 1.00 /100;
        return result1;
    }

}
