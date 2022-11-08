package pl.devsmentoring.java.Module5;

public class Exercise10 {
    //Napisz program w którym będzie tablica dwuwymiarowa o rozmiarach: 10 rzędów i 3 kolumny.
    //Do elementów zerowej kolumny załaduj kolejne liczby naturalne(i), do elementów następnej
    //kolumny załaduj ich kwadraty(i*i), a do następnej sześciany (i*i*i).
    //Wypisz zawartość tej tablicy na ekranie – właśnie w postaci trzech pionowych kolumn.

    public static void main(String[] args) {

        int[][] newTab = new int[10][3];

        for (int j = 0; j < newTab.length; j++) {
            for (int k = 0; k < newTab[k].length; k++) {
                newTab[j][k] = (int)Math.pow(j + 1, k + 1);
                System.out.print("[" + j + "]" + "[" + k + "]" + " = " + newTab[j][k] + "   ");
                System.out.print("    ");
            }
            System.out.println(" ");
        }

    }
}
