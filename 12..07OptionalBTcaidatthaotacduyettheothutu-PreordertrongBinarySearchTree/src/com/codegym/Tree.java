package com.codegym;

public interface Tree<E> {
    void insert(E e);

    void inorder();

    int getSize();
}
