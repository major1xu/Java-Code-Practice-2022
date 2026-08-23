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
    //ElevatorSelector es_1;

    /*
   You will need to create a default elevator selector that selects the elevator
   closest to the floor the passenger is requesting from. Tie breaks are at your
   discretion.
   */
    public int selectElevator(ElevatorSystem es, Passenger p, int destination_floor)
    {
        // default
        // sort elevators, find elevator which is closet to passenger's floor
        int passenger_floor =

        //es_1.select();

        // serve the passenger
        return 0;
    }

    public ElevatorSystem(
    //        ElevatorSelector es
    )
    {
        // initialization, set all elevators current floor to ground floor
        //es_1 = es;
    }

    public void travel(Elevator elevator, Passenger passenger, int destination_floor)
    {
        // take passenger
    }
}
