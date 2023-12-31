package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberTest {

    Member member1 = new Member("John Doe", "MID001", new ArrayList<>());
    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", true);

    @Test
    void getName() {
        assertEquals("John Doe", member1.getName());
    }

    @Test
    void getMemberID() {
        assertEquals("MID001", member1.getMemberId());
    }

    @Test
    void testBooksBorrowed() {
        assertEquals(Collections.emptyList(), member1.getBooksBorrowed());
    }

    @Test
    void testBorrowBook() {
        member1.borrowBook(book1);
        assertEquals(false , book1.getIsAvailable());
        member1.borrowBook(book1);
        assertEquals(false , book1.getIsAvailable());
    }

    @Test
    void testReturnBook() {
        member1.returnBook(book1);
        assertEquals(true , book1.getIsAvailable());
        member1.returnBook(book1);
        assertEquals(true , book1.getIsAvailable());
    }
}
