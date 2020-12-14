package com.codegym;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (E object : objects) insert(object);
    }

    @Override
    public void insert(E e) {
        TreeNode<E> newNode = new TreeNode<>(e);
        if (root == null)
            root = newNode;// * tạo một root mới * //
        else {
            // * xác định vị trí nút cha * //
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                int compareResult = e.compareTo(current.element);
                if (compareResult == 0)
                    return; // * Chưa chèn nút trùng lặp * /

                parent = current;
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
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorderRecursion(root);
    }

    // duyet trung thu tu>
    // con trai > cha > con phai
    protected void inorderRecursion(TreeNode<E> current) {
        if (current == null) {
            return;
        }
        inorderRecursion(current.left);
        System.out.println(current.element + " ");
        inorderRecursion(current.right);

    }

    //    duyet tien thu tu
    //    cha > con trai > con phai
    protected void preorderRecursion(TreeNode<E> current) {
        if (current == null) {
            return;
        }
        System.out.println(current.element + " ");
        preorderRecursion(current.left);
        preorderRecursion(current.right);

    }

    //    duyet hau thu tu
    //    con trai > con phai > cha
    protected void postorderRecursion(TreeNode<E> current) {
        if (current == null) {
            return;
        }
        postorderRecursion(current.left);
        postorderRecursion(current.right);
        System.out.println(current.element + " ");

    }

}