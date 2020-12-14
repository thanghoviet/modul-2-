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
                if (compareResult == 0)
                    return;
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
        return;// * phần tử được chèn thành công * /
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }


    public void deleteOperation(E elements) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (current.element.equals(elements)) {
                break;
            }
            int compareResult = elements.compareTo(current.element);
            if (compareResult == 0)
                return;

            parent = current;
            if (compareResult < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current.left==null){
            if (elements.compareTo(parent.element)<0){
                parent.left=current.right;
            }
            parent.right=current.right;
        }else {
                NodeHasLeftNode(parent,current);
        }
    }

    public void NodeHasLeftNode(TreeNode<E> fatherRemove,TreeNode<E> remove){
        TreeNode<E> newFather=remove;
        TreeNode<E> rightMost=remove.left;
        while (rightMost.right!=null){
            newFather=rightMost;
            rightMost=rightMost.right;
        }
        remove=rightMost;
        if (rightMost.right!=null) {
            newFather.right = rightMost.left;
        }else {
            newFather.left = rightMost.left;
        }
    }

    public void printTree(){

        System.out.println(root);
    }
}
