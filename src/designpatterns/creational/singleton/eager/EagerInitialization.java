package designpatterns.creational.singleton.eager;

/**
 * Singleton Pattern is used when we have to create only one instance of a class
 */
public class EagerInitialization {


    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
