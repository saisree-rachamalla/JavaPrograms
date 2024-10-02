package com.saisree.matrices;

public class DiagonalSum 
{

    public static int diagonalSum(int matrix[][])         
    {                                                     // Printing diagonal sum in 2D array.
        int sum = 0;

        for(int i =0; i< matrix.length;i++)                  // o(n^2)
        {
            for(int j =0 ;j<matrix[0].length;j++)
            {
                if(i == j)
                {
                    sum+= matrix[i][j];
                }
                else if( i+j == matrix.length-1)
                {
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }



            //  Another way with o(n) time complexity

        public static int diagonalsum(int matrix[][])
        {
            int sum = 0;

            for(int i=0;i<matrix.length;i++)                            //o(n)
            {
                //primary diagonal
                sum+= matrix[i][i];
                //secondary diagonal
                if(i!= matrix.length-1-i)
                    sum+= matrix[i][matrix.length-1-i]; 

            }
            return sum;
        }

    public static void main(String args[])
    {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

           System.out.println(diagonalSum(matrix));  //-------> o(n^2)
           System.out.println(diagonalsum(matrix));  //-------> o(n)
           


    }

}
