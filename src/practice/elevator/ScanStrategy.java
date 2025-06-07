package practice.elevator;

import java.util.PriorityQueue;
import java.util.Queue;

public class ScanStrategy implements IMovementStrategy{

    @Override
    public int nextStop(Elevator elevator) {
        Direction direction = elevator.direction;
        int currentFloor = elevator.currentFloor;
        Queue<ElevatorRequest> elevatorRequests = elevator.elevatorRequestList;

        PriorityQueue<ElevatorRequest> up = new PriorityQueue<>();
        PriorityQueue<ElevatorRequest> down = new PriorityQueue<>((a,b)->b.floor-a.floor);

        while (!elevatorRequests.isEmpty()){
            ElevatorRequest request = elevatorRequests.poll();
            int floor = request.floor;
            if(floor > currentFloor){
                up.add(request);
            }else{
                down.add(request);
            }
        }

        if(direction == Direction.UP){
            return !up.isEmpty() ? up.poll().floor:switchDirection(elevator,down);
        }else{
            return !down.isEmpty() ? down.poll().floor:switchDirection(elevator,up);
        }

    }

    private int switchDirection(Elevator elevator,PriorityQueue<ElevatorRequest> heap){
        elevator.direction = elevator.direction.name().equals(Direction.UP.name())?Direction.DOWN:Direction.UP;
        return heap.isEmpty() ?elevator.currentFloor:heap.poll().floor;
    }

}
