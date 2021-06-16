package com.codingchallenge;

public class RepeatStrings {
        public static void main(String[] args) {
            User user = new User();
            System.out.println(user.getClass());
        }

        String repeatNTimes(String s, int n) {
            StringBuilder repeat = new StringBuilder();
            for (int i = 0; i < n; i++) {
                repeat.append(s);
            }
            return repeat.toString();
        }
    }


    class User{  //should be outside this class but to reduce complexity

    }



   /*String repeatNTimes(String string,String repeatStr, int n){
           n = 10;
           string = null;
           String repeaStr = "";

           for (int i = 0; i < 10; i++) {
               repeaStr += string;
           }
           return repeaStr;

       } */


       /* private String repeatStr(final int repeat, final String string) {
            String repeatedString = "abc";
            for (int i = 0; i < 10; i++) {
                repeatedString += string;
            }
            return repeatedString;
        }
*/

    // repeat method
       /* public static void main(String[] args) {
            String string = "abc";
            int count = 3;
            System.out.println("String :" + string.repeat(count));

        }

    }
} */




