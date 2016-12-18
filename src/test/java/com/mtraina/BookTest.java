package com.mtraina;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {
    @Test
    public void should(){
        // when
        Book book = new Book("the title", Arrays.asList(new Chapter("the text")));

        // then
        assertThat(book.getTitle()).isEqualTo("the title");
    }
}
