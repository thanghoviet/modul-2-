package com.codegym;

public class testBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(100);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(65);
        tree.insert(62);
        tree.insert(67);
        tree.insert(66);
        //traverse tree
//        tree.deleteOperation(70);
//        tree.printTree();
//        System.out.println("The number of nodes is: " + tree.getSize());
        tree.search(65);
//        tree.search()
    }
}
