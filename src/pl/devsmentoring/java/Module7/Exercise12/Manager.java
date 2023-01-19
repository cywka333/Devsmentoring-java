package pl.devsmentoring.java.Module7.Exercise12;


// Zrób system, który obsługiwał będzie określone zamówienia.
// W programie istnieć będą 2 klasy: Manager oraz Order. W Managerze ma się
// znajdować mapa zamówień, w którym kluczem będzie obiekt zamówienia,
// a wartością jego ilość na stanie. W klasie Order natomiast mają znajdować
// się takie pola jak: id, nazwa, cena.

// Funkcjonalność programu to:
//- Dodawanie nowego zamówienia do mapy: jeżeli dodajemy
// obiekt, którego id znajduje się już w mapie, to nie dodajemy do
// niej nowego wpisu, ale zwiększamy jego ilość.
//- Dsuwanie zamówienia: zmniejszamy ilość o 1, zastanów się jak obsłużyć sytuację gdy ilość będzie równa 0.

import java.util.HashMap;

public class Manager {
    private HashMap<Order, Integer> orderMap;

    public Manager() {
        orderMap = new HashMap<Order, Integer>();
    }

    public void addOrder(Order order) {
        if (orderMap.containsKey(order)) {
            int quantity = orderMap.get(order);
            orderMap.put(order, quantity + 1);
        } else {
            orderMap.put(order, 1);
        }
    }

    public void removeOrder(Order order) {
        if (orderMap.containsKey(order)) {
            int quantity = orderMap.get(order);
            if (quantity > 1) {
                orderMap.put(order, quantity - 1);
            } else {
                orderMap.remove(order);
            }
        } else {
            System.out.println("Order not found in map.");
        }
    }
}