package com.sg.algorithms.tree;

public class BinarySearchTree {
    Node root;
    public  void insert(int value){
        insert(this.root,value);
    }

    private Node insert(Node root, int value){
        if (root==null){
             root = new Node();
             root.data=value;
        }else if(value< root.data){
            //insert to the left
            root.left= insert(root.left,value);

        }else if (value> root.data){
            //insert to the right
            root.right=insert(root.right,value);
        }
        return root;

    }

    }
