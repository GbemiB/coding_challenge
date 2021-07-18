package com.codingchallenge.hackerrank;

import java.util.List;

public class HourGlassSum {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 1, 1, 0, 0, 0}, {0, 1, 0 ,0, 0 ,0},
                {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0,0, 2, 0 ,0},{0, 0, 1, 2, 4, 0} };

        //hourGlassSum(array);

    }
      //using list not array
        public static void hourGlassSum(List<List<Integer>> a) {
            int maxSum = -63;
            int sum  = 0;
            for (int i =0; i < a.size() - 2; i++) {
                for (int j = 0; j < a.size() - 2; j++){
                    sum = a.get(i).get(j)+ a.get(i).get(j + 1) + a.get(i).get(j +2) +
                            + a.get(i + 1).get(j + 1) + a.get(i + 2).get(j) + a.get(i + 2).get(j + 1)
                            + a.get(i + 2).get(j + 2);
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
            //return maxSum;
            System.out.println(maxSum);
        }


}


