package org.example;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", true);

    //Book Testing
    @Test
    void getTitle() {
        assertEquals("The Great Gatsby" ,  book1.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("F. Scott Fitzgerald", book1.getAuthor());
    }

    @Test
    void getISBN() {
        assertEquals("1234567890", book1.getISBN());
    }

    @Test
    void testGetIsAvailable() {
        assertEquals(true , book1.getIsAvailable());
    }

    @Test
    void testSetIsAvailable() {
        book1.setIsAvailable(false);
        assertEquals(false , book1.getIsAvailable());
        book1.setIsAvailable(true);
    }

}