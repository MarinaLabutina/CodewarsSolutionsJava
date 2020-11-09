public class fakeBin {
    // Fake Binary
    // https://www.codewars.com/kata/57eae65a4321032ce000002d/solutions/java
    public static String fakeBin(String numberString) {
        String result="";
        for(int i=0;i<numberString.length();i++){
            if(numberString.charAt(i)>='5')
                result+='1';
            else
                result+='0';
        }
        return result;
    }

}
