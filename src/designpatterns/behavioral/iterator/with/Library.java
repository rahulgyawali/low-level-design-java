package designpatterns.behavioral.iterator.with;

import java.util.Iterator;
import java.util.List;

//Aggregator
public class Library {

    private List<Book> bookList;

    public Library(List<Book> bookList){
        this.bookList = bookList;
    }

    public Iterator createIterator(){
        return new BookIterator(bookList);
    }
}
