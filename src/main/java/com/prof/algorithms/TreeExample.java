package com.prof.algorithms;

public class TreeExample {

    public static void main(String[] args) {
        Tree root = new Tree(15,
                            new Tree(10,
                              new Tree(8, new Tree(11,new Tree(44),new Tree(50)),new Tree(18)),new Tree(12)),
                            new  Tree(45,
                              new Tree(30,new Tree(32,null,new Tree(34)),new Tree(25)),
                              new Tree(40, new Tree(16),new Tree(47))));

        System.out.println("Sum of Trees -> " + root.sumOfTree());
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public  Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public  int sumOfTree() {
            int sum = value;

            if(left != null){
                sum += left.sumOfTree();
            }

            if(right != null){
                sum += right.sumOfTree();
            }
            return sum;
        }
    }
}

