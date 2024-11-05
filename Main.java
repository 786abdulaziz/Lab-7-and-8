/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JUNAID COMPUTER
 */
public class Main {
        public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Counting total nodes
        System.out.println("Total nodes: " + tree.countNodes());

        // Traversals
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal();

        System.out.println("\n\nPre-order Traversal:");
        tree.preOrderTraversal();

        System.out.println("\n\nIn-order Traversal:");
        tree.inOrderTraversal();

        System.out.println("\n\nPost-order Traversal:");
        tree.postOrderTraversal();
    }
}
