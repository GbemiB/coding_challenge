package com.codingchallenge.hackerrank;
import java.io.*;
public class BinaryNumberChallenge {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            char[] BinaryArray = Integer.toBinaryString(n).toCharArray();

            int count=0;
            int max=0;
            while(n>0){
                if (n%2==1){
                    count++;
                    if (count>max)
                    {
                        max=count;
                    }
                }
                else{
                    count=0;
                }
                n=n/2;
            }

            bufferedReader.close();

            System.out.println(max);

        }
    }


