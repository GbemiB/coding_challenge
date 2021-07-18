package com.codingchallenge.generics;

   class Test<T, U> {
       T cap;   //Object of type T
       U hat;    // Obkect of type U

       public Test(T cap, U hat) {
           this.cap = cap;
           this.hat = hat;
       }

       // To print objects of T and U
        public void print()
        {
            System.out.println(cap);
            System.out.println(hat);
        }
    }

