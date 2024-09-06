package designpatterns.creational.singleton.lazy;

public class DBConnection {
    private static DBConnection dbConnectionObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        /**
         * Create Instance only when needed. But suffer from multiple access from thread
         */
        if(dbConnectionObject == null){
            dbConnectionObject = new DBConnection();
        }

        return dbConnectionObject;
    }
}
