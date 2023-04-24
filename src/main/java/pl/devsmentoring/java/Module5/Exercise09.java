package pl.devsmentoring.java.Module5;

public class Exercise09 {

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