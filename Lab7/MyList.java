package lab7;

import lab6.DefaultStone;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<DefaultStone> {

    private Node startNode;

    public MyList(){}
    public MyList(DefaultStone stone){
        add(stone);
    }
    public MyList(Collection<? extends DefaultStone> defaultStones){
        addAll(defaultStones);
    }
    @Override
    public int size() {
        int cntr = 0;
        Node node = startNode;
        if (startNode==null){
            return 0;
        }
        while (node!=null){
            node = node.getNextNode();
            cntr++;
        }
        return cntr;
    }

    @Override
    public boolean isEmpty() {
        return startNode==null;
    }

    @Override
    public boolean contains(Object o) {
        if ( o instanceof DefaultStone){
            DefaultStone stone = (DefaultStone) o;
            Node node = startNode;
            while (!node.getVal().equals(stone)&&node.getNextNode()!=null){
                node = node.getNextNode();
            }
                return node.getVal().equals(stone);
            }
        return false;
        }


    @Override
    public Iterator<DefaultStone> iterator() {
        return new MyListIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(DefaultStone stone) {
        Node node = startNode;
        if (startNode== null){
            startNode = new Node(stone);
            return true;
        } else {
            while (node.getNextNode()!=null){
                node = node.getNextNode();
            }
            node.setNextNode(new Node(stone));
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {

        Node node = startNode;
        if (startNode==null){
            return  false;
        } else {
            DefaultStone toBeRemoved = null;
            if (o instanceof DefaultStone){
                 toBeRemoved = (DefaultStone)o;
            } else {
                return false;
            }
            if (startNode.getVal().equals(toBeRemoved)){
                startNode = startNode.getNextNode();
            }
            while (node.getNextNode()!=null){
                if (node.getNextNode().getVal().equals(toBeRemoved)) {
                    node.setNextNode(node.getNextNode().getNextNode());
                    return true;
                } else {
                  node = node.getNextNode();
                }
            }
            if (node.getVal().equals(toBeRemoved)){
                node = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object s: collection) {
            boolean contains = contains(s);
            if (!contains){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends DefaultStone> collection) {
        for (DefaultStone s:collection) {
            this.add(s);
        }
        return true;
    }

    @Override
    public boolean addAll(int i, Collection<? extends DefaultStone> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        for (Object s:collection) {
            boolean remove = this.remove(s);
            if (!remove){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        startNode = null;
    }

    @Override
    public DefaultStone get(int i) {
        return null;
    }

    @Override
    public DefaultStone set(int i, DefaultStone stone) {
        return null;
    }

    @Override
    public void add(int i, DefaultStone stone) {
        if (i>size()-1){
            throw new IndexOutOfBoundsException(i);
        }
        Node node = startNode;
        for (int j=0;j<i;j++){
            node = node.getNextNode();
        }
         node.setVal(stone);
    }

    @Override
    public DefaultStone remove(int i) {
        if (i>size()-1){
            throw new IndexOutOfBoundsException(i);
        }
        Node node = startNode;
        for (int j=0;j<i;j++){
            node = node.getNextNode();
        }
        DefaultStone val = node.getVal();
        remove(val);
        return val;
    }

    @Override
    public int indexOf(Object o) {
        DefaultStone index = null;
        Node node = startNode;
        if (o instanceof DefaultStone) {
            index = (DefaultStone) o;
        } else {
            return -1;
        }
        int cntr = 0;
        if (startNode.getVal().equals(index)) {
            return 0;
        }
        while (node.getNextNode() != null) {
            cntr++;
            if (node.getNextNode().getVal().equals(index)) {
                return cntr;
            } else {
                node = node.getNextNode();
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<DefaultStone> listIterator() {
        return null;
    }

    @Override
    public ListIterator<DefaultStone> listIterator(int i) {
        return null;
    }

    @Override
    public List<DefaultStone> subList(int i, int i1) {
        return null;
    }
    class MyListIterator implements  Iterator<DefaultStone>{
        private Node currentNode = startNode;
        @Override
        public boolean hasNext() {
            return currentNode !=null;
        }

        @Override
        public DefaultStone next() {
            DefaultStone stone = currentNode.getVal();
            currentNode = currentNode.getNextNode();
            return stone;
        }
    }
}

