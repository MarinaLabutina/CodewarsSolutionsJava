public class AbbreviateTwoWords {
    // Abbreviate a Two Word Name
    // https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/solutions/java

    public static String abbrevName(String name) {
        int spaceInd = name.indexOf(" ", 1);
        return (name.charAt(0) + "." + name.charAt(spaceInd+1)).toUpperCase();
    }
}
