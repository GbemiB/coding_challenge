package com.codingchallenge.hackerrank.Abstract;

public abstract class  Book { //Already duplicated thus commented out
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}



