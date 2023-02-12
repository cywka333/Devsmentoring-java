package pl.devsmentoring.java.Module9.Exercise5;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Debenture debenture1 = new Debenture(BigDecimal.valueOf(1000), 1, 0.05);
        Debenture debenture2 = new Debenture(BigDecimal.valueOf(2000), 2, 0.03);
        Stock stock1 = new Stock(BigDecimal.valueOf(5000), 3);
        Stock stock2 = new Stock(BigDecimal.valueOf(3000), 4);

        List<Securities> securitiesList = new ArrayList<>();
        securitiesList.add(debenture1);
        securitiesList.add(debenture2);
        securitiesList.add(stock1);
        securitiesList.add(stock2);

        SecuritiesPortfolio portfolio = new SecuritiesPortfolio(securitiesList);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Step " + i + ":");
            portfolio.step();
            System.out.println("Value of whole portfolio is: " + portfolio.getTotalValue());
            for (Securities security : securitiesList) {
                System.out.println("Value of securities ID: " + security.getId() + " is equal: " + security.getValue());
            }
            System.out.println();
        }
    }
}
