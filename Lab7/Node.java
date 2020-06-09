package lab7;

import lab6.DefaultStone;

public class Node {
    private DefaultStone val;
    private Node nextNode;

    public DefaultStone getVal() {
        return val;
    }

    public Node(DefaultStone val) {
        this.val = val;
    }

    public void setVal(DefaultStone val) {
        this.val = val;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
