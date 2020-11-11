public class Sequence {
    // Reversed sequence
    // https://www.codewars.com/kata/5a00e05cc374cb34d100000d/solutions/java

    public static int[] reverse(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = n-i;
        return  arr;
    }

}
