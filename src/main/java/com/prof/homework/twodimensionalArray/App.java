package com.prof.homework.twodimensionalArray;

public class App {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,6,7},
                        {2,4,6,8,9},
                        {3,5,8,10,12}};
        System.out.println(isContains(matrix, 11));
    }

    static boolean isContains(int[][] matrix, int num){
        int colum = 0;
        int row = matrix[0].length -1;
        while ((colum < matrix.length) && (row > 0)){
            if(matrix[colum][row] == num){
                return true;
            }
            if (matrix[colum][row]<num){
                colum ++;
            }else {
                row --;
            }
        }
        return false;
    }
}
