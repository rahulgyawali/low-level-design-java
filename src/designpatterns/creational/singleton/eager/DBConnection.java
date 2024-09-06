package designpatterns.creational.singleton.eager;

public class DBConnection {

    private static DBConnection dbConnectionObject = new DBConnection();

    private DBConnection(){

    }

    public static DBConnection getInstance() {
        return dbConnectionObject;
    }
}
