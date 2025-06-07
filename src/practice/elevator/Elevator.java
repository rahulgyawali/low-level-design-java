package practice.elevator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Elevator {
    int currentFloor;
    Direction direction;
    IMovementStrategy movementStrategy;
    Queue<ElevatorRequest> elevatorRequestList;

    Elevator(){
        elevatorRequestList = new LinkedList<>();
    }
}
