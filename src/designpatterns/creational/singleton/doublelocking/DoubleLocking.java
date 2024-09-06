package designpatterns.creational.singleton.doublelocking;

public class DoubleLocking {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
