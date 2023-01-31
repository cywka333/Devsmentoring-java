package pl.devsmentoring.java.Module7.Exercise12;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Order order1 = new Order(1, "Computer", 1000.00);
        Order order2 = new Order(2, "Phone", 500.00);
        Order order3 = new Order(3, "Tablet", 800.00);
        Order order4 = new Order(4, "Headphones", 200.00);

        manager.addOrder(order1);
        manager.addOrder(order2);
        manager.addOrder(order3);
        manager.addOrder(order4);

        manager.removeOrder(order3);
    }
}
