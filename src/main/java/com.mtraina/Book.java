package com.mtraina;

import com.google.common.base.MoreObjects;

import java.util.List;

public final class Book {
    private final String title;
    private final List<Chapter> chapters;

    public Book(String title, List<Chapter> chapters) {
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public List<Chapter> getChapters(){
        return chapters;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("title", title)
                .add("chapters", chapters)
                .toString();
    }
}

