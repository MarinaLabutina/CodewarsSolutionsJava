public class nthPower {
    // N-th Power
    // https://www.codewars.com/kata/57d814e4950d8489720008db/solutions/java

    public static int nthPower(int[] array, int n) {
        if (n>=array.length) return -1;
        return (int)Math.pow(array[n],n);
    }
}
