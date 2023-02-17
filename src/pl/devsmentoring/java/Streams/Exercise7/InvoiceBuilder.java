package pl.devsmentoring.java.Streams.Exercise7;

import java.util.*;

public class InvoiceBuilder {

    private List<Product> orders;

    public InvoiceBuilder(List<Product> orders) {
        this.orders = orders;
    }

    public List<Map.Entry<String, Double>> buildInvoice() {
        List<Map.Entry<String, Double>> invoice = new ArrayList<>();
        for (Product product : orders) {
            double price = product.getQuantity() * product.getPrice();
            if (price < 100) {
                price += 10;
            }
            invoice.add(new AbstractMap.SimpleEntry<>(product.getId(), price));
        }
        invoice.sort(Comparator.comparing(Map.Entry::getValue));
        return invoice;
    }
}