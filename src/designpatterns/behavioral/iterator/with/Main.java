package designpatterns.behavioral.iterator.with;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(100, "ABC"),
                new Book(200, "DEF"),
                new Book(300, "GHI")
        );
        Library library = new Library(bookList);
        Iterator iterator = library.createIterator();
        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
