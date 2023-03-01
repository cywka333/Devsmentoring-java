package pl.devsmentoring.java.Module4.Exercise11;

public class Exercise11 {

    public static void main(String[] args) {
//        Zad. 11
//        Twoim zadaniem jest złamać metodą brute-force (https://pl.wikipedia.org/wiki/Atak_brute_force)
//        słabe hasło składające się z 4 znaków będących literami alfabetu łacińskiego (litery zarówno małe
//        jak i wielkie). Wygeneruj wszystkie możliwe kombinacje takiego hasła i wyświetl każdą z osobna.
//
//        Podpowiedź:
//        Wykorzystaj pętle zagnieżdżone
        // UPPERCASE ASCII 65-90 + lowercase 97-122

        for (int i = 65; i <= 122; i++) {
            if (i > 90 && i < 97) {
                continue;
            }
            for (int j = 65; j <= 122; j++) {
                if (j > 90 && j < 97) {
                    continue;
                }
                for (int k = 65; k <= 122; k++) {
                    if (k > 90 && k < 97) {
                        continue;
                    }
                    for (int l = 65; l <= 122; l++) {
                        if (l > 90 && l < 97) {
                            continue;
                        }
                        System.out.println((char) i + " " + (char) j + " " + (char) k + " " + (char) l);
                    }
                }
            }
        }
    }
}
