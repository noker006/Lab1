package com.grsu.service;



import com.grsu.model.Car;
import com.grsu.model.TaxiPark;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;



public class TaxiParkService {


    /**
     * Sort park cars by fuel consumption
     * @param taxiPark
     * actual taxi park
     */
    public static void sort(TaxiPark taxiPark){
        taxiPark.getCars().sort((o1, o2) -> o1.getFuelConsumption() > o2.getFuelConsumption()? 1 : o1.getFuelConsumption() == o2.getFuelConsumption() ? 0 : -1);
    }

    /**
     *Search car by speed range
     * @param start
     * start of range
     * @param end
     * end of range
     * @param taxiPark
     * actual taxi park
     * @return
     * list of searched cars
     */
    public static ArrayList<Car> search(int start, int end, TaxiPark taxiPark){
        ArrayList<Car> searchCars = new ArrayList<Car>();
        for (Car car: taxiPark.getCars()) {
            if (car.getSpeed() >= start && car.getSpeed() <= end){
                searchCars.add(car);
                 return searchCars;
            }
        }
        return null;
    }

    /**
     * calculate sum of park cars
     * @param taxiPark
     * actual taxi park
     * @return
     * sum of park cars
     */
    public static int getCost(TaxiPark taxiPark){
        int sum = 0;
        for (Car car: taxiPark.getCars()) {
            sum += car.getPrice();

        }
        System.out.println("The price of taxi station = " + sum);
        return sum;
    }
}
