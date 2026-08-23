package com.freightflock;

import lombok.Getter;
import lombok.Setter;
/*
The number of elevators and floors in the system must be provided when the
system is created. The system should support up to 10 elevators and up to 100
floors.
*/

@Getter
@Setter
class Elevator {
    int current_floor; // between 1 and 100
}