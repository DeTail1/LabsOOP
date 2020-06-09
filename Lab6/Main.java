package lab6;

import java.math.BigInteger;
/*
Прокопчук Дмитро ІО-93
9326 % 13 = 5
 */
public class Main {
    public static void main(String[] args) {
        double startRange = 0.4;
        double endRange = 0.6;
        Necklace necklace = new Necklace();
        necklace.addStone(new ValuableStone("Diamond",0.54,0.66,new BigInteger("54000000"),100));
        necklace.addStone(new ValuableStone("Topiaz",0.34,0.46,new BigInteger("2100000"),85));
        necklace.addStone(new FakedStone("JapaneseTopiaz",0.34,0.21,new BigInteger("200"),29));
        necklace.addStone(new FakedStone("ChineseUberTopiaz",0.5,0.54,new BigInteger("2100000"),85));
        necklace.addStone(new FakedStone("ChineseDiamond",0.55,0.50,new BigInteger("100"),50));
        necklace.addStone(new SemiValuableStone("IdkSemiValuableStones",0.332,0.31,new BigInteger("3000000"),80));

        System.out.println("----Raw necklace----");
        System.out.println(necklace);
        System.out.println("-----Sort by price-----");
        System.out.println(necklace.sortByPrice());
        System.out.println("------Finding in range "+startRange+" to "+endRange+" by opacity--------");
        System.out.println(necklace.findStonesInRangeByOpacity(startRange,endRange));
    }
}
