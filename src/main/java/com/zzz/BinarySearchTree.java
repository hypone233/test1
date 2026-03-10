package com.zzz;

public class BinarySearchTree {

    class Node{
         int value;
         Node left;
         Node right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }
    private Node root;

    public BinarySearchTree(){
        root = null;
    }
    public void insert(int value){
        root = insertTree(root,value);
    }
    private Node insertTree(Node current,int value){
        if(current == null){
            return new Node(value);
        }

        if(value < current.value){
            current.left = insertTree(current.left,value);
        }else if(value > current.value){
            current.right = insertTree(current.right,value);
        }
        return current;

    }
    public boolean search(int value) {
        return searchTree(root, value);
    }
    private boolean searchTree(Node current,int value){
        if(current == null){
            return false;
        }
        if(value == current.value){
            return true;
        }
        if(value < current.value){
           return searchTree(current.left,value);
        }else return searchTree(current.right,value);
    }
    public void delete(int value){
        root = deleteTree(root,value);
    }
    private Node deleteTree(Node current,int value){
        if(current == null){
            return null;
        }
        if(value == current.value){

            if(current.left == null && current.right == null){
                return null;
            }

            if(current.left == null){
                return current.right;
            }
            if(current.right == null){
                return current.left;
            }
            int small = findSmallestValue(current.right);
            current.value = small;
            current.right = deleteTree(current.right,small);
            return current;

        }
        if (value < current.value) {
            current.left = deleteTree(current.left, value);
        } else {
            current.right = deleteTree(current.right, value);
        }
        return current;
    }
    private int findSmallestValue(Node root) {
        if (root.left == null) {
            return root.value;
        }
        return findSmallestValue(root.left);
    }

}
