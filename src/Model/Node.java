package Model;

/**
 *
 * @author Gabriel Schiavon
 */
public class Node {
    private String value;
    private Node nodeLeft;
    private Node nodeRight;
    
    public Node() {}
    public Node(String value) {
        super();
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }
    
    @Override
    public String toString() {
        return "Node [valor=" + value + "]";
    }    

}
