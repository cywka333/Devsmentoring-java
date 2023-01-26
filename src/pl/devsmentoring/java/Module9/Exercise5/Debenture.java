package pl.devsmentoring.java.Module9.Exercise5;

import java.math.BigDecimal;

public class Debenture extends Securities{

    private double interestRate;

    public Debenture(BigDecimal value, int id, double interestRate) {
        super(value, id);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void step() {
        BigDecimal interest = value.multiply(BigDecimal.valueOf(interestRate));
        value = value.add(interest);
    }
}
