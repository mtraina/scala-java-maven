package com.mtraina;

public final class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return "title:" + title;
    }
}

