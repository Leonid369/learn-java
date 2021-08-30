package com.sara;

public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] C = new int[A.length][A[0].length];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                for(int k = 0; k < A.length; k++){
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }

        for(int[] x: C){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
