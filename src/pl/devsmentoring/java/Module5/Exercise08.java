package pl.devsmentoring.java.Module5;

public class Exercise08 {

    public static void main(String[] args) {

        //Napisz program, który policzy, ile znajduje się liczb trzycyfrowych w każdej z nich.

        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};

        int threeDigitNumbersInFirstArray = 0;
        int threeDigitNumbersInSecondArray = 0;

        for (int firstCounting : numbers) {
            if (firstCounting >= 100 && firstCounting < 1000) {
                threeDigitNumbersInFirstArray++;
            }
        }

        for (int[] arrayName : numbers2D) {
            for (int elem : arrayName) {
                if (elem >= 100 && elem < 1000) {
                    threeDigitNumbersInSecondArray++;
                }
            }
        }

        System.out.println("Three numbers in first array: " + threeDigitNumbersInFirstArray);
        System.out.println("Three numbers in secon array: " + threeDigitNumbersInSecondArray);


    }
}
