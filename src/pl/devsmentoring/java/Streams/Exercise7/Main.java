package pl.devsmentoring.java.Streams.Exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> orders = new ArrayList<>(List.of(
                new Product("34587", "Learning Java", 4, 40.95),
                new Product("98762", "Programming Java", 5, 56.80),
                new Product("77226", "Head First Java", 3, 32.95),
                new Product("88112", "Java for beginners", 3, 24.99)
        ));

        InvoiceBuilder invoiceBuilder = new InvoiceBuilder(orders);
        List<Map.Entry<String, Double>> invoice = invoiceBuilder.buildInvoice();

        for (Map.Entry<String, Double> item : invoice) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}