package com.codingchallenge.hackerrank.Abstract;

public abstract class  Book { //Already duplicated thus commented out
    String title = "Java";
    String author = "Gbemisola";

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    abstract void display();
}



