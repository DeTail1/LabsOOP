package lab7;

import lab6.DefaultStone;
import lab6.ValuableStone;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

/*
Прокопчук Дмитро ІО-93
9326 % 2 = 0 (List)
9326 % 3 = 2 (Однозв’язний список)
 */
public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        ValuableStone diamond = new ValuableStone("Diamond", 0.54, 0.66, new BigInteger("54000000"), 100);
        ValuableStone diamond2 = new ValuableStone("Diamond", 0.54, 0.66, new BigInteger("54000000"), 100);
        ValuableStone diamond3 = new ValuableStone("Diamond", 0.54, 0.66, new BigInteger("54000000"), 100);
        list.add(diamond);
        list.add(diamond2);
        list.add(diamond3);
        list.remove(diamond);
        list.remove(diamond2);
        System.out.println("Is empty = "+list.isEmpty());

        System.out.println("Size  = " + list.size());

        Iterator<DefaultStone> iterator = list.iterator();
        System.out.println("Stones iterator:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("index of diamond3 "+list.indexOf(diamond3));
        list.add(0,diamond);
        System.out.println("contains diamond "+list.contains(diamond));

        List<? extends DefaultStone> stones = List.of(diamond,diamond2,diamond3);
        MyList list2 = new MyList(stones);
        System.out.println("size of list 2 = "+list2.size());

    }
}
