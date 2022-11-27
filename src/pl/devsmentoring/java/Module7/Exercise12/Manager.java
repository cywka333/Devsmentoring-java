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
import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Order, Integer> ordersMap = new HashMap<Order, Integer>();

        Order order1 = new Order(0, "First product", 22.22);
        Order order2 = new Order(1, "Second product", 33.77);
        Order order3 = new Order(2, "Third product", 593.88);

        ordersMap.put(order1, 1);
        ordersMap.put(order2, 20);
        ordersMap.put(order3, 30);

        System.out.println("The amount of order 1 is: " + ordersMap.get(order1));
        System.out.println("The amount of order 2 is: " + ordersMap.get(order2));
        System.out.println("The amount of order 3 is: " + ordersMap.get(order3));

        System.out.println("Please tell me what to do. Enter 'add' to add order of product or 'remove' to remove the amount of order");
        String userChoiceAddOrRemove = scanner.nextLine();

        if (userChoiceAddOrRemove.equals("add")) {
            System.out.println("You entered: " + userChoiceAddOrRemove + ". Please give me the id of product (0-2): ");
            int userIdInput = scanner.nextInt();

            if (userIdInput == order1.getId() || userIdInput == order2.getId() || userIdInput == order3.getId()) {
                switch (userIdInput) {
                    case 0:
                        System.out.println("It is the id of product: " + order1.getName() +
                                ". Right now the amount of order is: " + ordersMap.get(order1));
                        System.out.println("Please enter the quantity you want to add to order: ");
                        int amount1 = scanner.nextInt();
                        ordersMap.put(order1, amount1 + ordersMap.get(order1));
                        System.out.println("The amount of order is: " + ordersMap.get(order1));
                        break;
                    case 1:
                        System.out.println("It is the id of product: " + order2.getName() +
                                ". Right now the amount of order is: " + ordersMap.get(order2));
                        System.out.println("Please enter the quantity you want to add to order: ");
                        int amount2 = scanner.nextInt();
                        ordersMap.put(order2, amount2 + ordersMap.get(order2));
                        System.out.println("The amount of order is: " + ordersMap.get(order2));
                        break;
                    case 2:
                        System.out.println("It is the id of product: " + order3.getName() +
                                ". Right now the amount of order is: " + ordersMap.get(order3));
                        System.out.println("Please enter the quantity you want to add to order: ");
                        int amount3 = scanner.nextInt();
                        ordersMap.put(order3, amount3 + ordersMap.get(order3));
                        System.out.println("The amount of order is: " + ordersMap.get(order3));
                        break;
                }
            } else if (userIdInput > 3) {
                System.out.println("Unfortunately, we don't have product with this id. Please come back later.");
            }

        } else if (userChoiceAddOrRemove.equals("remove")) {
            System.out.println("You entered " + userChoiceAddOrRemove + ". Please give me the id of product (0-2): ");
            int userIdInput = scanner.nextInt();

            if (userIdInput == order1.getId() || userIdInput == order2.getId() || userIdInput == order3.getId()) {
                switch (userIdInput) {
                    case 0:
                        System.out.println("It is the id of product: " + order1.getName() +
                                ". Right now the amount of order is: " + ordersMap.get(order1));
                        if (ordersMap.get(order1) - 1 <= 0){
                            System.out.println("There are no orders for this product.");
                        }else {
                            System.out.println("I am going to remove 1 order from this product.");
                            ordersMap.put(order1, ordersMap.get(order1) - 1);
                            System.out.println("The amount of order is: " + ordersMap.get(order1));
                        }
                        break;
                    case 1:
                        System.out.println("It is the id of product: " + order2.getName() +
                                ". Right now the amount of order is: " + ordersMap.get(order2));
                        if (ordersMap.get(order2) - 1 <= 0){
                            System.out.println("There are no orders for this product.");
                        }else {
                            System.out.println("I am going to remove 1 order from this product.");
                            ordersMap.put(order2, ordersMap.get(order2) - 1);
                            System.out.println("The amount of order is: " + ordersMap.get(order2));
                        }
                        break;
                    case 2:
                        System.out.println("It is the id of product: " + order3.getName() +
                                ". Right now the amount of order is: " + ordersMap.get(order3));
                        if (ordersMap.get(order3) - 1 <= 0){
                            System.out.println("There are no orders for this product.");
                        }else {
                            System.out.println("I am going to remove 1 order from this product.");
                            ordersMap.put(order3, ordersMap.get(order3) - 1);
                            System.out.println("The amount of order is: " + ordersMap.get(order3));
                        }
                        break;
                }
            }   else {
                System.out.println("You probably entered wrong value. Please choose between 0-2!");
            }
        } else {
            System.out.println("You probably entered the wrong word. Please try again.");
        }
    }
}