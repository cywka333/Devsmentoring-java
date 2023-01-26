package pl.devsmentoring.java.Module9.Exercise5;

import java.math.BigDecimal;

public abstract class Securities {
    protected BigDecimal value;
    private int id;

    public Securities(BigDecimal value, int id) {
        this.value = value;
        this.id = id;
    }

    public abstract void step();

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
