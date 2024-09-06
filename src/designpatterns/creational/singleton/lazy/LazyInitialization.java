package designpatterns.creational.singleton.lazy;

/**
 * Singleton Pattern is used when we have to create only one instance of a class
 */
public class LazyInitialization {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
