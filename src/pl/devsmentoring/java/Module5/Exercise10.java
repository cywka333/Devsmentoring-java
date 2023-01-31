package pl.devsmentoring.java.Module5;

public class Exercise10{

    public static void main(String[] args) {

        int[][] tabSquaresAndCubesOfNaturalNumbers = new int[10][3];

        for (int j = 0; j < tabSquaresAndCubesOfNaturalNumbers.length; j++) {
            for (int k = 0; k < tabSquaresAndCubesOfNaturalNumbers[k].length; k++) {
                tabSquaresAndCubesOfNaturalNumbers[j][k] = (int)Math.pow(j + 1, k + 1);
                System.out.print("[" + j + "] [" + k + "] = " + tabSquaresAndCubesOfNaturalNumbers[j][k] + "    ");
            }
            System.out.println(" ");
        }
    }
}
