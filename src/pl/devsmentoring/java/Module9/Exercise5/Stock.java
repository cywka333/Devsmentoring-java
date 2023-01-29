package pl.devsmentoring.java.Module9.Exercise5;

import java.math.BigDecimal;
import java.util.Random;

public class Stock extends Securities {
    Random random = new Random();
    BigDecimal tenPercent;

    public Stock(BigDecimal value, int id) {
        super(value, id);
    }

    private void valueUp(){
        tenPercent = getValue().multiply(new BigDecimal("0.1"));
        value = value.add(tenPercent);
    }

    private void valueDown(){
        tenPercent = getValue().multiply(new BigDecimal("-0.1"));
        value = value.add(tenPercent);
    }

    @Override
    public void step() {
        random.nextBoolean();
        if (random.nextBoolean()){
            valueUp();
            System.out.println("Your stock goes up! Value: " + value);
        }else {
            valueDown();
            System.out.println("Your stock value goes down! Value: " + value);
        }
    }
}
