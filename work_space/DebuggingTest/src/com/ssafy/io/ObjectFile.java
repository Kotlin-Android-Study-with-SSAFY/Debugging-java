package com.ssafy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectFile {
    private final String FILE_PATH = "data" + File.separator + "bookObjects.dat";

    public void saveBookObjects(List<Book> books) throws Exception {
        File target = new File(FILE_PATH);
        FileOutputStream fos = new FileOutputStream(target);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            oos.writeObject(book);
        }

        fos.close();
        oos.close();
        System.out.println("기록하였습니다.");
    }

    public List<Book> loadBookObjects() throws Exception {
        File target = new File(FILE_PATH);
        List<Book> books = new ArrayList<>();
        FileInputStream fis = new FileInputStream(target);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true) {
                Object readed = ois.readObject();
                if (readed == null || !(readed instanceof Book)) {
                    break;
                } else {
                    Book book = (Book) readed;
                    books.add(book);
                }
            }
        } catch (Exception e) {
            System.out.println("모든 데이터를 읽었습니다.");
        }
        fis.close();
        ois.close();
        return books;
    }
}
