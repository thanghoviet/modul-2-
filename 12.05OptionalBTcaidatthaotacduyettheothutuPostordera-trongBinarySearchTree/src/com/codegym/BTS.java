package com.codegym;

public class BTS<E> {
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
}
