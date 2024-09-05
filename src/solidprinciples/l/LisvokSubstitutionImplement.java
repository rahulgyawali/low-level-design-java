package solidprinciples.l;

public class LisvokSubstitutionImplement {

    /**
     * Keep only the most common functionality on parent that gets replicated across the child classes
     */
    class Vehicle {

        /**
         *
         * Wheel is common in all
         */
        public Integer getNumberOfWheels(){
            return 2;
        }
    }

    class EngineVehicle extends Vehicle {

        /**
         * Engine is shared among the type of Vehicles
         */

        public boolean hasEngine(){
            return true;
        }
    }

    class Bicycle extends Vehicle {

    }

    class Car extends EngineVehicle {

    }

    class MotorCycle extends EngineVehicle {

    }
}
