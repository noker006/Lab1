package com.grsu.factory;


import com.grsu.model.Car;
import com.grsu.model.CarType;

public class CarCreator extends AbstractCreator{
    public Car create(String[] s) {
        Car car = new Car();
        initCar(car, s);
        car.setType(CarType.valueOf(s[6]));
        return car;
    }
}
