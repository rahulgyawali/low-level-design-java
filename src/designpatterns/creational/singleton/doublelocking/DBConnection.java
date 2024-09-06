package designpatterns.creational.singleton.doublelocking;

public class DBConnection {

    private static DBConnection dbConnectionObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        /**
         * First we check if null or not. Suppose two threads try to access it and it is null. Only one enters and locks. if null creates instance and leave while other
         * thread will find non null value and return from the method. Only one locking needed.
         */
        if(dbConnectionObject == null){
            synchronized (DBConnection.class){
                if(dbConnectionObject == null){
                    dbConnectionObject = new DBConnection();
                }
            }

        }
        return dbConnectionObject;
    }

}
