package com.grsu.model;

public class Car{

    protected int id;
    protected String name;
    protected double fuelConsumption;
    protected int speed;
    protected int price;
    private CarType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarType getType() { return type; }

    public void setType(CarType type) {
        this.type = type;
    }

    public Car() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (id != car.id) return false;
        if (!name.equals(car.name)) return false;
        if (fuelConsumption != car.fuelConsumption) return false;
        if (speed != car.speed) return false;
        if (price != car.price) return false;
        if (type != car.type) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id + (null != name ? 0: name.hashCode()) + fuelConsumption +
                speed * 31 + price + (type.equals(CarType.PREMIUM) ? 1 : 0));
    }

    @Override
    public String toString() {
        return  "Car"+
                "{id=" + id +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}

