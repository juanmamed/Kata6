/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        ArrayList<CarToy> cars = new ArrayList<>();
        ArrayList<HelicopterToy> helicopters = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                if (line.equals("car")){
                    CarToy car = (CarToy) business.createToy("car");
                    cars.add(car);
                    System.out.println(
                               "Built cars: " + cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(",")));
                }
                else if (line.equals("helicopter")){
                    HelicopterToy helicopter = (HelicopterToy) business.createToy("helicopter");
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
    

