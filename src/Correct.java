public class Correct {
    // Correct the mistakes of the character recognition software
    // https://www.codewars.com/kata/577bd026df78c19bca0002c0/solutions/ja

    public static String correct(String string) {
        return string.replaceAll("0","O").replaceAll("5", "S").replaceAll("1","I");
    }
}
