package pl.devsmentoring.java.Module5;

import java.util.HashMap;
import java.util.Map;

public class Exercise16 {
    //Utwórz mapę, która reprezentować będzie zestaw pięciu unikalnych imion
    // wraz z przypisanym do nich numerem PESEL (przechowywanym w formie Stringa). Następnie:
    //Sprawdź, czy w mapie znajduje się imię Anna. Wydrukuj stosowny komunikat, w zależności
    // od tego, czy imię jest obecne w mapie.
    //Sprawdź, czy w mapie znajduje się w wartość, która rozpoczyna się znakiem: “9”. Wykorzystaj m.in
    // metodę .startsWith()
    //Usuń 2 dowolne pary klucz : wartość z mapy
    //Zweryfikuj rozmiar mapy i wyświetl komunikat “The map’s size is correct.”, jeśli rozmiar listy
    // będzie wynosił 3.
    //Spróbuj pobrać z mapy wartość spod klucza “Euzebiusz”. Jeśli taki klucz nie znajduje się w Twojej mapie,
    // to niech operacja pobierania klucza zwróci tekst: “No such name!”.
    //Sprawdź, czy mapa jest pusta. Jeśli tak - wyświetl komunikat: “Nothing to do here!”, a jeśli
    // zawiera jakiekolwiek elementy - wyświetl informację o jej rozmiarze.
    public static void main(String[] args) {


        // Initializing new HashMap keyType String, type String
        Map<String, String> fiveNames = new HashMap<>();
        fiveNames.put("Tomek", "96040219445");
        fiveNames.put("Piotr", "97040213445");
        fiveNames.put("Klaudia", "96023215465");
        fiveNames.put("Patryk", "96640514441");
        fiveNames.put("Anna", "96020114454");

        // Looking for Anna as a key.
        if (fiveNames.containsKey("Anna")) {
            System.out.println("Our map contains name : Anna");
        }
        System.out.println(" ");

        // Checking if some value starts with "9"
        for (Map.Entry<String, String> entry : fiveNames.entrySet()) {
            if (entry.getValue().startsWith("9")) {
                System.out.println("Some value starts with 9.");
                break;
            }
        }

        // Deleting 2 pairs from map
        fiveNames.remove("Tomek");
        fiveNames.remove("Patryk");
        System.out.println(fiveNames);

        if (fiveNames.size() == 3) {
            System.out.println("The map’s size is correct.");
        }

        // Trying to get key Euzebiusz, if not defaultValue = display Value
        System.out.println(fiveNames.getOrDefault("Euzebiusz", "No such name!"));

        // Checking if map is empty. If not, displaying size of the map
        if (fiveNames.isEmpty()) {
            System.out.println("Nothing to do here!");
        } else {
            System.out.println("Size of the map is: " + fiveNames.size());
        }


    }
}
