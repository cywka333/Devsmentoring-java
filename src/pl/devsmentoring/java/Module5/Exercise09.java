package pl.devsmentoring.java.Module5;

public class Exercise09 {
    // Zdefiniuj tablicę trójwymiarową o następującym kształcie:
    //
    //10 20 30 40 50 60
    //70 80 90 100 110 120 130
    //140 150 160 170 180 190 200 210
    //220 230 240 250 260 270 280 290 300

    public static void main(String[] args) {

        int[][] arr = new int[4][];
        arr[0] = new int[6];
        arr[1] = new int[7];
        arr[2] = new int[8];
        arr[3] = new int[9];

        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number;
                number += 10;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
