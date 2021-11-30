package com.codingchallenge.hackerrank;
import java.util.*;

public class LinkedLink {

        static class pair
        {
            int first, second;

            public pair(int first, int second)
            {
                this.first = first;
                this.second = second;
            }
        }

        // Function to return total number
        // of steps required to fill
        // entire matrix with '1'

        static int numberOfSteps(int n, int[][] mtrx)
        {

            // Queue to store indices with 1
            Queue<pair> q = new LinkedList<>();

            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if (mtrx[i][j] == 1)
                    {
                        q.add(new pair(i, j));
                    }
                }
            }

            // Initialise step variable as zero
            int step = 0;

            // BFS approach
            while (!q.isEmpty())
            {
                int qsize = q.size();

                // Visit all indices with 1 and
                // fill its neighbouring cells by 1
                while (qsize-- > 0)
                {
                    pair p  = q.peek();
                    q.remove();

                    int i = p.first;
                    int j = p.second;

                    // Convert the neighbour from '0' to '1'
                    if ((j > 0) && mtrx[i][j - 1] == 0)
                    {
                        mtrx[i][j - 1] = 1;
                        q.add(new pair(i, j - 1));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((i < n - 1) && mtrx[i + 1][j] == 0)
                    {
                        mtrx[i + 1][j] = 1;
                        q.add(new pair(i + 1, j));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((j < n - 1) && mtrx[i][j + 1] == 0)
                    {
                        mtrx[i][j + 1] = 1;
                        q.add(new pair(i, j + 1));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((i > 0) && mtrx[i - 1][j] == 0)
                    {
                        mtrx[i - 1][j] = 1;
                        q.add(new pair(i - 1, j));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((i > 0) && (j > 0) &&
                            mtrx[i - 1][j - 1] == 0)
                    {
                        mtrx[i - 1][j - 1] = 1;
                        q.add(new pair(i - 1, j - 1));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((i > 0) && (j < (n - 1)) &&
                            mtrx[i - 1][j + 1] == 0)
                    {
                        mtrx[i - 1][j + 1] = 1;
                        q.add(new pair(i - 1, j + 1));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((i < (n - 1)) && (j < (n - 1)) &&
                            mtrx[i + 1][j + 1] == 0)
                    {
                        mtrx[i + 1][j + 1] = 1;
                        q.add(new pair(i + 1, j + 1));
                    }

                    // Convert the neighbour from '0' to '1'
                    if ((i < (n - 1)) && (j > 0) &&
                            mtrx[i + 1][j - 1] == 0)
                    {
                        mtrx[i + 1][j - 1] = 1;
                        q.add(new pair(i + 1, j - 1));
                    }
                }

                // Count steps
                step++;
            }
            return step - 1;
        }

        // Driver code
        public static void main(String[] args)
        {

            // Dimension of matrix NXN
            int n = 5;
            int [][]mtrx = { { 0, 0, 0, 0, 0 },
                    { 1, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 1, 0, 0 },
                    { 0, 0, 0, 1, 0 } };

//            // Dimension of matrix NXN
//            int n = 3;
//            int [][]mtrx = {
//                    {0, 0, 0, 0, 0, 0},
//                    {1, 0, 0, 0, 0, 0},
//                    {0, 0, 0, 0, 0, 0},
//                    {0, 0, 1, 0, 0, 0},
//                    {0, 0, 0, 1, 0, 0}
//            };

            // Print number of steps
            System.out.print(numberOfSteps(n, mtrx));
        }
    }

