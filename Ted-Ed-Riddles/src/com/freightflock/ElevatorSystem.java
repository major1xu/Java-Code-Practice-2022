package com.freightflock;

import java.util.*;

/*
note: work in progress, not done yet - this was a Karat code interview done in April 2022, if my memory is correct.
That Karat interviewer is fairly nice, again if my memory is correct.

This assignment somewhat reminds me of a similar one many year ago
https://github.com/major1xu/QueueingSimulation

======
Your task is to create a simplified elevator system with the following
requirements:

 - Once a passenger presses a call button, the elevator system should apply an
   algorithm which selects an elevator to service the passenger’s request. We
   will call this algorithm the ‘elevator selector’.

-  An elevator selector must be provided when the system is created. The
   elevator selector is the most likely component of the system to change.
   In fact, another team will be dedicated to creating and testing different
   selector algorithms for their effectiveness. You must design a system that
   makes it possible for this team to work in parallel with you.

 - You will need to create a default elevator selector that selects the elevator
   closest to the floor the passenger is requesting from. Tie breaks are at your
   discretion.

 - The number of elevators and floors in the system must be provided when the
   system is created. The system should support up to 10 elevators and up to 100
   floors.

 - When the system is first started, every elevator must be on the groundfloor.

 - In this system, the call button panel that is typically found inside an
   elevator is instead found on each floor. Passengers must press a call button
   from the floor they are on, specifying their destination floor to request an
   elevator.

 - You can assume that elevator requests are synchronous; there will never be
   two elevator requests at the same time.

 - You can assume that elevators travel instantaneously from their current
   floor, to the request floor to pick up the passenger, and finally to the
   destination floor. There is no notion of time in this system.
*/

class ElevatorSystem implements elevatorSelector {
    ArrayList<Elevator> elevatorList = new ArrayList<Elevator>(10);

    /*
   You will need to create a default elevator selector that selects the elevator
   closest to the floor the passenger is requesting from. Tie breaks are at your
   discretion.
   */
    public int selectElevator(ElevatorSystem es, Passenger p, int destination_floor)
    {
        // sort elevators, find elevator which is closet to passenger's floor
        int passenger_floor = p.getFloor();

        // Pick an elevator that is closet to the passenger floor, if tied, it will pick the first one on the elevator list
        // up or down does not matter, we only look at the floor levels
        int closest_elevator = 0;

        //System.out.println(elevatorList.size());

        int floor_difference = Math.abs(passenger_floor - elevatorList.get(0).getCurrent_floor());

        for(int ii = 1; ii < 10; ii++)
        {
            if( floor_difference > (Math.abs(passenger_floor - elevatorList.get(ii).getCurrent_floor())) )
            {
                closest_elevator = ii;
                floor_difference = Math.abs(passenger_floor - elevatorList.get(ii).getCurrent_floor());
            }
        }

        // serve the passenger
        //System.out.println(closest_elevator);
        return closest_elevator;
    }

    public ElevatorSystem()
    {
        elevatorList = new ArrayList<Elevator>(10);

        // initialization, set all elevators current floor to ground floor
        for(int ii = 0; ii < 10; ii++)
        {
            Elevator newElevator = new Elevator();
            newElevator.setCurrent_floor(1); // a good test is ii+1
            elevatorList.add(newElevator);
        }
    }

    public void travel(Elevator elevator, Passenger passenger, int destination_floor)
    {
        // take passenger
    }

    public static void main(String[] args)
    {
        ElevatorSystem elevatorSystem = new ElevatorSystem();
        Passenger passenger = new Passenger(10, 1);
        System.out.println("passenger floor=" + 10);
        int elevator_number = elevatorSystem.selectElevator(elevatorSystem, passenger, 100);
        System.out.println("elevator_number=" + (elevator_number+1) + " elevator floor="+
                elevatorSystem.elevatorList.get(elevator_number).getCurrent_floor());
    }
}
