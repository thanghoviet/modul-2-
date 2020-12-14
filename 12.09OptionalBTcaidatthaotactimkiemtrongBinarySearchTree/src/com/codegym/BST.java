package com.codegym;

public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    public void insert(E e) {
        TreeNode<E> newNode = new TreeNode<>(e);
        // node : 20
        if (root == null)
            root = newNode;// * tạo một root mới * //
        else {
            // * xác định vị trí nút cha * //
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                int compareResult = e.compareTo(current.element);
                parent = current;
                if (compareResult == 0)
                    return;
                if (compareResult < 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            if (e.compareTo(parent.element) < 0)
                parent.left = newNode;
            else
                parent.right = newNode;
        }
        size++;
        return;// * phần tử được chèn thành công * /
    }


    public boolean search(E element) {
//        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            int compareResult = element.compareTo(current.element);
            if (compareResult < 0) {
                current = current.left;
            } else if (compareResult > 0) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }
}