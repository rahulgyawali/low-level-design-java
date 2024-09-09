package designpatterns.behavioral.strategy.without;

/**
 *
 * Parent
 *                C1
 *              /   \
 *             /     \
 *            C2     C3
 *            /\     /\
 *           /  \   /  \
 *          C4  C5 C6  C7
 *
 * Childs
 *
 * C2 and C3 seperately have common code
 *
 */
public class Strategy {

    public class Vehicle{

        void drive(){
            //Normal Capacity
        }

        void brake(){
            //Normal Capacity
        }
    }

    public class PassengerVehicle extends Vehicle{

    }

    public class SportsVehicle extends Vehicle{
        @Override
        void drive(){
            //Special Capability
        }
    }

    public class OffRoadVehicle extends Vehicle{
        @Override
        void drive(){
            //Special Capability
        }
    }

    public class GoodsVehicle extends Vehicle{
        @Override
        void brake(){
            //Special Capability
        }
    }


    /**
     * Common Code between SportsVehicle and OffRoadVehicle
     */

    /**
     *
     * This problem can be extended beyond drive method to similar like horn, brakes,
     */

}
