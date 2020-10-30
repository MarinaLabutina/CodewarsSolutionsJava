public class Kata {

    // https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/solutions/java
    public static int[] invert(int[] array) {

        int[] result = new int[array.length];

        for (int i = 0;i < array.length; i++) {
            result[i] = -array[i];
        }

        return result;
    }
}
