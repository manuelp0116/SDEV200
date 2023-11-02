package SDEV200;

import java.util.Scanner;

public class identicalArrays {
    public static void main(String[] args) {

       /** Get user input */
       System.out.print("Enter list 1: ");
       int[][] list1 = getArray();
       System.out.print("Enter list 2: ");
       int[][] list2 = getArray();

       /** display results */
       System.out.println("The two arrays are" + (equals(list1, list2) ? " " : "not") + "identical");

    }

    /** getArray intializes the 3x3  matrix with user input*/
    public static int [][] getArray() {
        Scanner input = new Scanner(System.in);

        final int ROWS = 3;
        final int COLUMNS = 3;

        int[][] m = new int[ROWS][COLUMNS];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    /** determines if the 3x3 arrays are equal */
    public static boolean equals ( int[][] m1, int[][] m2) {
        int[] list1 = sort(m1);
        int[] list2 = sort(m2);
        for(int i = 0; i < list1.length; i++) {
            if(list1[i] != list2[i])
                return false;
        }
        return true;
    }
    
    /** returns array intitizlized with matrix elements */
    public static int[] matrixToArray(int[][] m) {
        int[] list = new int[m.length * m[0].length];
        int k = 0;
        for (int i = 0 ; i< m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                list[k] = m[i][j];
                k++;
            }
        }
        return list;
    }

    /** sorts each column in a 3x3 array in ascending order */
    public static int[]sort(int[][] m) {
        int[] list = matrixToArray(m);
        for (int i = 0; i < 3; i++) {
            //find min column 1
            int min = list[i];
            int minIndex = i;

            for(int j = i + 1; j < 3; j++) {
                if(min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }
}
