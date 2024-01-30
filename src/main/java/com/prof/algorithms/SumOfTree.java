package com.prof.algorithms;

import com.sun.source.tree.Tree;

public class SumOfTree {
    public static void main(String[] args) {
        Tree root = new Tree(10,
                     new Tree(6),new Tree(4));
        System.out.println(root.checkTree());
    }

   public static class Tree{
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Tree(int value){
            this.value = value;
        }

        public  boolean checkTree(){
            int sum = 0 ;

            if(left != null){
                sum += left.value;
            }
            if(right != null){
                sum += right.value;
            }
            return value == sum;
        }
    }
}
