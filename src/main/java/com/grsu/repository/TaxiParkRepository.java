package com.grsu.repository;


import com.grsu.factory.FactoryMethod;
import com.grsu.model.Car;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaxiParkRepository {

    public static List<Car> findAll() {
        List<Car> cars = new ArrayList<Car>();
        FactoryMethod factoryMethod = new FactoryMethod();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("cars.txt"));
            byte[] a = new byte[fileInputStream.available()];
            fileInputStream.read(a, 0, fileInputStream.available());
            String p = new String(a);
            String[] w = p.split("\n");
            for (String q: w) {
                String[] s = q.split("(, )|($)");
                Car car = factoryMethod.getCreator(s[0]).create(s);
                cars.add(car);
            }
            fileInputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } catch (IOException ex) {

            System.out.println("IOException!");
        }
        return cars;
    }

}
