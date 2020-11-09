public class Converter {
    // Miles per gallon to kilometers per liter
    // https://www.codewars.com/kata/557b5e0bddf29d861400005d/solutions/java
    public static float mpgToKPM(final float mpg) {

        float gallon = 4.54609188f;
        float mile = 1.609344f;

        return Math.round(mpg * mile / gallon * 100) / 100.0f;
    }

}
