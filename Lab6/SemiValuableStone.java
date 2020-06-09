package lab6;

import java.math.BigInteger;

public class SemiValuableStone extends DefaultStone {
    private double quality;

    public SemiValuableStone(String name, double weight, double opacity, BigInteger price, double quality) {
        super(name, weight, opacity, price);
        this.quality = quality;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Semi-rare stone "+this.getName()+" with price "+this.getPrice().toString()+" with opacity "+this.getOpacity()+ " with quality = "+this.getQuality();

    }
}
