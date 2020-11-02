public class Kata4 {
    // Find the position!
    // https://www.codewars.com/kata/5808e2006b65bff35500008f/solutions/java

    public static String position(char alphabet)
    {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == alphabet) {
                number = i+1;
            }
        }
        return "Position of alphabet: " + number;
    }
}
