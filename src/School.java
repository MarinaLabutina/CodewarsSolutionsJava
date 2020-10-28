public class School {
    // Get the mean of an array
    // https://www.codewars.com/kata/563e320cee5dddcf77000158/solutions/java

    public static int getAverage(int[] marks) {
        int result = 0;
        for (int i = 0; i < marks.length; i++) {
            result += marks[i];
        }
        return result / marks.length;
    }
}

