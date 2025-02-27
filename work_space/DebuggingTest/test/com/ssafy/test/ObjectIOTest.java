package com.ssafy.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import com.ssafy.io.Book;
import com.ssafy.io.ObjectFile;

class ObjectIOTest {

    @Test
    @Order(1)
    void saveObjectTest() throws Exception {
        ObjectFile of = new ObjectFile();
        List<Book> books = Book.previewData();
        of.saveBookObjects(books);
    }

    @Test
    @Order(2)
    void loadObjectTest() throws Exception {
        ObjectFile of = new ObjectFile();
        List<Book> books = of.loadBookObjects();
        assertEquals(books.get(3).getTitle(), "Design Patterns");
    }

    @Test
    @Order(3)
    void hideBookSSNTest() throws Exception {
        ObjectFile of = new ObjectFile();
        List<Book> books = of.loadBookObjects();
        assertNull(books.get(4).getSsn());
    }
}
