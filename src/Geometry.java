public class Geometry {
    // Area of a Square
    // https://www.codewars.com/kata/5748838ce2fab90b86001b1a/solutions/java/me/best_practice

    public static double squareArea(double A){
        double s = Math.pow(2 * A / Math.PI, 2);
        return Math.round(s * 100) / 100.0;
    }
}
