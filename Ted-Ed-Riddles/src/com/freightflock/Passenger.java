package com.freightflock;

import lombok.Getter;

@Getter
class Passenger {
    int floor;
    int passenger_number;
/*
    Once a passenger presses a call button, the elevator system should apply an
    algorithm which selects an elevator to service the passenger’s request. We
    will call this algorithm the ‘elevator selector’.
 */
    // call button
    public Passenger(int floor, int passenger_number)
    {
        this.floor = floor;
        this.passenger_number = passenger_number;
    }

    public void callElevator(ElevatorSystem elevatorSystem, int destination_floor)
    {
        //elevatorSystem.selectElevator(elevatorSystem, destination_floor);
    }
}