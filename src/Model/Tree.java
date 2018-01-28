/*
 * Jogo desenvolvido como avaliação técnica para a empresa Objective.
 */
package Model;

/**
 *
 * @author Gabriel Schiavon
 */
public class Tree {
    private Node root;
    
    public Tree(){}
    public Tree(String value) {
        this.root = new Node(value);
    }
    
    public Node getRoot() {
        return root;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void insertLeft(Node node, String value) {
        if (node.getNodeLeft() == null) {
            node.setNodeLeft(new Node(value));
        }
    }
    
    public void insertRight(Node node, String value) {
        if (node.getNodeRight() == null) {
            node.setNodeRight(new Node(value));
        }
    }
}
