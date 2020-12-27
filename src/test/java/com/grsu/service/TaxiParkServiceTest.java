package com.grsu.service;


import com.grsu.factory.CarCreator;
import com.grsu.model.Car;
import com.grsu.model.TaxiPark;
import com.grsu.repository.TaxiParkRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TaxiParkServiceTest {
    @Test
    public void searchTest() {
        TaxiPark taxiPark = new TaxiPark();
        TaxiParkService taxiParkService = new TaxiParkService();
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setSpeed(190);
        cars.add(car);
        taxiPark.setCars(cars);
        int startSpeed = 180;
        int endSpeed=250;
        Assert.assertNotNull(TaxiParkService.search(startSpeed,endSpeed,taxiPark));
    }

    @Test
    public void getCostTest() {
        TaxiPark taxiPark = new TaxiPark();
        TaxiParkService taxiParkService = new TaxiParkService();
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setPrice(2500);
        cars.add(car);
        taxiPark.setCars(cars);
        Assert.assertEquals(2500, TaxiParkService.getCost(taxiPark));
    }

    @Test
    public void sortTest() {
        List<Car> cars = TaxiParkRepository.findAll();
        TaxiPark taxiPark = new TaxiPark();
        taxiPark.setCars(cars);
        TaxiParkService.sort(taxiPark);
        ArrayList<Car> sortedCars = (ArrayList<Car>)taxiPark.getCars();
        Assert.assertTrue(sortedCars.get(0).getFuelConsumption() <= sortedCars.get(1).getFuelConsumption());
    }
}