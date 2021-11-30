package com.codingchallenge.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class functionalprogramming {
    public static void main(String[] args) {

        //TO PRINT OUT ALL THE COURSES
        List<String> courses =
                List.of("Spring", "Springboot", "AWS", "Docker", "Azure", "Kubernetes");
        courses.stream()
                .forEach(System.out::println);

        // TO FILTER COURSE WITH spr AND PRINT THEM OUT
        List<String> values =
                List.of("Spring", "Springboot", "AWS", "Docker", "Azure", "Kubernetes");
        values.stream()
                .filter(myCourse -> myCourse.contains("Spr"))
                .forEach(System.out::println);

        //TO FILTER AND PRINT COURSES GREATER THAN LENGTH OF THREE
        List<String> valuesData =
                List.of("Spring", "Springboot", "AWS", "Docker", "Azure", "Kubernetes");
        valuesData.stream()
                .filter(myCourse -> myCourse.length() > 3)
                .forEach(System.out::println);

        // TO PRINT OUT ALL NUMBERS
        List<Integer> numbers = List.of(12,23,45,56,67,72);
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        // TO PRINT OUT SQUARES OF NUMBERS: MAP GENERATES ENTIRELY NEW VALUES
        List<Integer> numbersVal = List.of(2,3,4,5,6,7);
        numbersVal.stream()
                .map(num -> num * num)
                .forEach(System.out::println);


        // DISTINCT PICKS ONE OF DUPLICATE VALUES AND SORTED SORTS THE NUMBERS ORDERED
        // DISTINCT AND SORTED CAN BE USED DIFFERENTLY
        List<Integer> numbersValxy = List.of(2,3,4,5,6,7,2,3,45,56,1,2,3,3);
        numbersValxy.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //DISTINCT AND SORTED ALSO WORKS FOR STRINGS
         List<String> valuesDatan =
                List.of("Spring", "Spring", "Springboot","Springboot", "AWS", "AWS", "Docker", "Docker", "Azure", "Kubernetes");
         valuesDatan.stream()
                 .distinct()
                 .sorted()
                .forEach(System.out::println);
//
//               // USING SORTED
//                 .sorted() // using sorted() uses this method .sorted(Comparator.naturalOrder()) means in ascending alphabetical order
//                 .sorted(Comparator.naturalOrder())
//                 .sorted(Comparator.reverseOrder()) //in descending alphabetical order
//                .sorted(Comparator.comparing(str -> str.length()))  // specifying it should be sorted in order of length

        List<Integer> numbersValx = List.of(2,3,4,5,6,7);
        numbersValx.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

       //Bi predicate returns boolean and bi functions can return other data types
    }
}
