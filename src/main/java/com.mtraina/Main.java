package com.mtraina;

import com.google.common.collect.Lists;

public class Main {

    public static void main(String[] args){
        Book book = new Book("War and peace", Lists.newArrayList(new Chapter("Chapter 1")));
        System.out.println("the book is:" + book);
    }
}