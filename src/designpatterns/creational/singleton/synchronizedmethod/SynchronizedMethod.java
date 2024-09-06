package designpatterns.creational.singleton.synchronizedmethod;

import designpatterns.creational.singleton.synchronizedmethod.DBConnection;

public class SynchronizedMethod {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
