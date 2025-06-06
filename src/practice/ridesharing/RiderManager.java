package practice.ridesharing;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    private static RiderManager riderManager = null;
    Map<Integer,Rider> riderMap = new HashMap<>();

    public RiderManager(){
        this.riderMap = new HashMap<>();
    }

    public void addRider(int riderId,Rider rider){
       this.riderMap.put(riderId,rider);
    }

    public Rider getRider(int riderId){
        return this.riderMap.get(riderId);
    }

    public static RiderManager riderManager()
    {
        if (riderManager == null) {
            riderManager = new RiderManager();
        }
        return riderManager;
    }
}
