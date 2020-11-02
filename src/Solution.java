public class Solution {
    // String repeat
    // https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/solutions/java

    public static String repeatStr(final int C, final String string) {
        String str = "";
        int i = 1;
        while (C != 0 && i <= C ){
            str += string;
            i++;
        }
        return str;
    }

}

