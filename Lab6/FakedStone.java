package lab6;

import java.math.BigInteger;

public class FakedStone extends DefaultStone {
    private double accuracy;


    public FakedStone(String name, double weight, double opacity, BigInteger price, double accuracy) {
        super(name, weight, opacity, price);
        this.accuracy = accuracy;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Faked stone "+this.getName()+" with price "+this.getPrice().toString()+" with opacity "+this.getOpacity()+ " with accuracy = "+this.getAccuracy();

    }
}
