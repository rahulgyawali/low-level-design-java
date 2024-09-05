package solidprinciples.l;

/**
 * L stands for Lisvok Substitution.
 *
 * This tells that if class B is a sub class of class A, then we should be able to replace the object of A with B without breaking the behavior of program
 *
 * i.e A subclass should extend the capability of a parent class rather than narrowing it down
 */
public class LisvokSubstitution {

    interface Bike {
        void turnOnEngine();
        void accelerate();
    }

    class MotorCycle implements Bike{
        boolean isEngineOn;
        int speed;
        @Override
        public void turnOnEngine(){
            this.isEngineOn = true;
        }
        @Override
        public void accelerate(){
            this.speed = this.speed + 1;
        }
    }

    class Bicycle implements Bike{

        @Override
        public void turnOnEngine(){
           throw new AssertionError("There is no Engine");
            /**
             * This is limiting the capability of the main class i.e. bicycle cannot turn on the engine
             *
             * Class B is not replaceable with class A
             *
             * Violation of Liskov Substitution
             *
             */
        }
        @Override
        public void accelerate(){
            //Do something
        }
    }



}
