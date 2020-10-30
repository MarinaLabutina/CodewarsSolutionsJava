public class ZywOo {
    // https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/solutions/java/me/best_practice
    public static String warnTheSheep(String[] array) {
        for(int i=0;i<array.length-1;i++)
            if(array[i].equals("wolf"))return "Oi! Sheep number "+(array.length-i-1)+"! You are about to be eaten by a wolf!";
        return "Pls go away and stop eating my sheep";
    }

}

