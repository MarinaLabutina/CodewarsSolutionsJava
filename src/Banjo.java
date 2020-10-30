public class Banjo {

    // https://www.codewars.com/kata/53af2b8861023f1d88000832/solutions/java

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        String result;
        if (name.toLowerCase().charAt(0) == 'r')

            result = name + " plays banjo";
        else
            result = name + " does not play banjo";
        return result;
    }
}
