public class Block {
    // Building blocks
    // https://www.codewars.com/kata/55b75fcf67e558d3750000a3/solutions/java/me/best_practice

    int width;
    int length;
    int height;

    Block(int[] arr){
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    int getWidth(){
        return width;
    }

    int getLength(){
        return length;
    }

    int getHeight(){
        return height;
    }

    int getVolume(){
        return width * length * height;
    }

    int getSurfaceArea() {
        return width * length * 2
                + length * height * 2
                + width * height * 2;
    }
}
