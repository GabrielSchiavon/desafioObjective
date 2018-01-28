/*
 * Jogo desenvolvido como avaliação técnica para a empresa Objective.
 */
package jogogourmet;

import Model.Node;
import Model.Tree;
import Vision.Initial;

/**
 *
 * @author Gabriel Schiavon
 */
public class JogoGourmet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = new Tree("Massa");
        tree.getRoot().setNodeLeft(new Node("Lazanha"));
        tree.getRoot().setNodeRight(new Node("Bolo de Chocolate"));
        Initial initialView = new Initial(tree);
        initialView.setVisible(true);
    }
    
}
