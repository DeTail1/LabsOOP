package lab6;

import java.math.BigInteger;

public class ValuableStone extends DefaultStone {
    private double rarity;

    public ValuableStone(String name, double weight, double opacity, BigInteger price, double rarity) {
        super(name, weight, opacity, price);
        this.rarity = rarity;
    }

    public double getRarity() {
        return rarity;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return "Rare stone "+this.getName()+" with price "+this.getPrice().toString()+" with opacity "+this.getOpacity()+ " with rarity = "+this.getRarity();

    }
}
