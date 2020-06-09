package lab6;

import java.math.BigInteger;

public class DefaultStone {
    private String name;
    private double weight;
    private double opacity;
    private BigInteger price;

    public DefaultStone(String name, double weight, double opacity, BigInteger price) {
        this.name = name;
        this.weight = weight;
        this.opacity = opacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Default stone "+this.getName()+" with price "+this.getPrice().toString()+" with opacity "+this.getOpacity();
    }
}
