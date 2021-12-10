/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                if (line.equals("car")){
                    Car car = business.createCar();
                    cars.add(car);
                    System.out.println(
                               "Built cars: " + cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(",")));
                }
                else if (line.equals("helicopter")){
                    Helicopter helicopter = business.createHelicopter();
                    helicopters.add(helicopter);
                    System.out.println(
                               "Built helicopters: " + helicopters.stream()
                                .map(h -> h.getSerialNumber().toString())
                                .collect(Collectors.joining(",")));
                } else {
                    System.out.println("Command unknown!");
                }
            }
        }
    }
}
    

