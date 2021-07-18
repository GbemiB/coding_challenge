package com.codingchallenge.generics;

public class Book<T> {

    // We use < > to specify Parameter type
       // An object of type T is declared
       T obj;

    public Book(T obj) { this.obj = obj; } //constructor

    public T getObject()  { return this.obj; }
}



