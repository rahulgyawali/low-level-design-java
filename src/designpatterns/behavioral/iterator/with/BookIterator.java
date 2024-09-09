package designpatterns.behavioral.iterator.with;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {

    private List<Book> books;
    private int index = 0;

    public BookIterator(List<Book> bookList){
        books = bookList;
    }

    @Override
    public boolean hasNext(){
        return index < books.size();
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return books.get(index++);
        }
        return null;
    }

}
