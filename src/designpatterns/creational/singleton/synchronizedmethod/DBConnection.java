package designpatterns.creational.singleton.synchronizedmethod;

public class DBConnection {
    private static DBConnection dbConnectionObject;

    private DBConnection(){

    }

    public synchronized static DBConnection getInstance(){
        /**
         * Each time the code is locked before checking which is an expensive operation so we can avoid locking with double locking
         */
        if(dbConnectionObject == null){
            dbConnectionObject = new DBConnection();
        }

        return dbConnectionObject;
    }
}
