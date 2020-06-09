package lab6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Necklace {
    private List<DefaultStone> stones = new ArrayList<>();
    public Necklace(){}
    public Necklace(List<DefaultStone> stones){
        this.stones = stones;
    }
    public boolean addStone(DefaultStone stone){
        return stones.add(stone);
    }

    public BigInteger calculateTotalPrice(){
      return stones.stream().map(DefaultStone::getPrice).reduce(BigInteger::add).orElse(BigInteger.ZERO);
    }
    public double calculateTotalWeight(){
        return stones.stream().mapToDouble(DefaultStone::getWeight).sum();
    }
    public Necklace sortByPrice(){
        return new Necklace(stones.stream().sorted(Comparator.comparing(DefaultStone::getPrice).reversed()).collect(Collectors.toList()));
    }
    public Necklace findStonesInRangeByOpacity(double startValue, double finalValue){
        return new Necklace(stones.stream().filter(el -> startValue <= el.getOpacity()&& el.getOpacity() <= finalValue).collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Necklace consists of: [ \n");
        stones.forEach(el->stringBuilder.append(el.toString()+"\n"));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
