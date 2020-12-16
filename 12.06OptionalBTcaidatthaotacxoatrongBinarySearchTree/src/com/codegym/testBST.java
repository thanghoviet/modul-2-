package com.codegym;

public class testBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(65);
        tree.insert(62);
        tree.insert(67);
        tree.insert(66);
        tree.insert(58);
        tree.insert(59);
        tree.insert(55);
        //traverse tree

        tree.deleteOperation(60);
        tree.inorder();

    }
}
