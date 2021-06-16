package com.codingchallenge.hackerrank;
import java.util.*;

public class DictionaryMapChallenge {

        public static void main(String []args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            Map<String, Integer> myDictionary = new HashMap<>();
            for(int i = 0; i < n; i++){
                String name = in.next();  // TODO your can enter the name and numbers yourself, hacker rank entered it automatically
                int phone = in.nextInt();  // TODO try to manually set the length of phone number and throw exceptions
                myDictionary.put(name, phone);
            }

            while(in.hasNext()){
                String s = in.next();
                if (myDictionary.containsKey(s))
                {
                    System.out.println(s + "="+ myDictionary.get(s));
                }
                else
                {
                    System.out.println("Not found");
                }
            }
            in.close();
        }
    }

