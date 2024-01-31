package ch11.ex02_Interfaces_Part1;

interface FlightEnabled {
    public abstract void takeOff();
    abstract void land();
    void fly();
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
