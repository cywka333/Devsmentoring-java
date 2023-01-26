package pl.devsmentoring.java.Module9.Exercise5;

import java.math.BigDecimal;
import java.util.List;


public class SecuritiesPortfolio {

    private List<Securities> securitiesList;
    BigDecimal total = BigDecimal.valueOf(0);

    public SecuritiesPortfolio(List<Securities> securitiesList) {
        this.securitiesList = securitiesList;
    }

    public void step() {
        for (Securities displaySecurity : securitiesList) {
            displaySecurity.step();
        }
    }

    public BigDecimal getTotalValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Securities security : securitiesList) {
            total = total.add(security.getValue());
        }
        return total;
    }
}

