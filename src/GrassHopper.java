public class GrassHopper {

    //     Grasshopper - Summation
    // https://www.codewars.com/kata/55d24f55d7dd296eb9000030/solutions/java/me/best_practice

   public static int summation(int n) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;

            }
            return sum;
        }

    public static void main(String[] args) {
        int result = summation(2);
        System.out.println(result);

    }

}
