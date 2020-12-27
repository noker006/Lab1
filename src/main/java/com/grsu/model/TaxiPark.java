package com.grsu.model;

import java.util.List;

public class TaxiPark {

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        TaxiPark taxiPark = (TaxiPark) o;
        return cars.equals(taxiPark.getCars());
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (Car car: cars) {
            hashCode = 31 * hashCode + (car == null ? 0 : car.hashCode());
        }
        return hashCode;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+
                "{cars=" + cars +
                '}';
    }
}
