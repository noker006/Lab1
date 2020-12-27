package com.grsu.runner;


import com.grsu.model.Car;
import com.grsu.model.TaxiPark;
import com.grsu.repository.TaxiParkRepository;
import com.grsu.service.TaxiParkService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import java.util.List;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {


    public static void main(String[] args) {

        TaxiPark taxiPark = new TaxiPark();
        taxiPark.setCars(TaxiParkRepository.findAll());

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("1.Sort by fuel consumption;\n2.Print cars;\n3.Search(start speed,end speed);\n4.Get cost of taxicab;\n5.exit");
        while (!(input = scanner.nextLine()).equals("exit")) {

            if (input.equals("sort()")) {
                TaxiParkService.sort(taxiPark);
                print(taxiPark.getCars());
            } else if (input.equals("print()")) {
                print(taxiPark.getCars());
            } else if (input.matches("search\\(\\d+, \\d+\\)")) {
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(input);
                matcher.find();

                int startSpeed = Integer.parseInt(matcher.group());
                matcher.find();

                int endSpeed = Integer.parseInt(matcher.group());
                print(TaxiParkService.search(startSpeed, endSpeed, taxiPark));
            } else if (input.equals("getCost()")) {
                System.out.println(TaxiParkService.getCost(taxiPark));
            } else {
                System.out.println("try again");
            }
        }
        scanner.close();
    }

    private static void print(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
