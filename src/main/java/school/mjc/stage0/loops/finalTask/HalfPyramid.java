package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i < cathetusLength + 1; i++){
            for (int j = 1; j < cathetusLength+1; j++){

                if (i > cathetusLength - j){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
