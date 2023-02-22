package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i < cathetusLength + 1; i++){
            for (int j = 1; j < cathetusLength+1; j++){
                if (i > cathetusLength - j){
                    System.out.print(cathetusLength - j + 1);
                } else System.out.print(" ");
            }
            for (int j = cathetusLength + 1; j < cathetusLength *2; j++){
                if (i > j - cathetusLength){
                    System.out.print(j - cathetusLength + 1);
                } else continue;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
