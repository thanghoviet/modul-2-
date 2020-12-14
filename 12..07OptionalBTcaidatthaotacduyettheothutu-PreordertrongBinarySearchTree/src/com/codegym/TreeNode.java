package com.codegym;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    public TreeNode(E e){
        element=e;
    }
    @Override
    public String toString() {
        return "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '|';
    }

}
