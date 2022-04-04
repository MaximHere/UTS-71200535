package com.rplbo.vehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel,int capacity) {
        super();
        super.setEngine(engine);
        super.setTransmision(transmision);
        super.setTire(tire);
        super.setWheel(wheel);
        this.capacity = capacity;
    }

    public void backward() {
    }

    public void brake() {
    }

    public void foward() {
    }

    public void turnLeft() {
    }

    public void turnRight() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
