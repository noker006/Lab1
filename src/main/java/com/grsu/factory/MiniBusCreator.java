package com.grsu.factory;


import com.grsu.model.Car;
import com.grsu.model.MiniBus;
import com.grsu.model.MiniBusType;

public class MiniBusCreator extends AbstractCreator{
    @Override
    public Car create(String[] s) {
        MiniBus miniBus = new MiniBus();
        initCar(miniBus, s);
        miniBus.setFunction(MiniBusType.valueOf(s[6]));
        return miniBus;
    }
}
