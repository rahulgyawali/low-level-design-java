package solidprinciples.l;

public class LisvokSubstitutionImplement {

    interface Bike {
        void turnOnEngine();
        void accelerate();
    }

    class MotorCycle implements Bike {
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
}
