package designpatterns.behavioral.iterator.with;

public class Book {

    private int price;
    private String bookName;

    Book(int price,String bookName){
        this.price = price;
        this.bookName = bookName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public int getPrice(){
        return  this.price;
    }

    public void setPricePrice(int price){
        this.price = price;
    }
}
