package com.grsu.factory;


import com.grsu.model.Car;

public abstract class AbstractCreator {
    public abstract Car create(String[] s);
    protected void initCar(Car car, String[] s){
        car.setId(Integer.valueOf(s[1]));
        car.setName(s[2]);
        car.setFuelConsumption(Double.valueOf(s[3]));
        car.setSpeed(Integer.valueOf(s[4]));
        car.setPrice(Integer.valueOf(s[5]));
    }
}
