public class Sum {
    // Array plus array
    // https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/solutions/java

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        return sum;
    }
}
