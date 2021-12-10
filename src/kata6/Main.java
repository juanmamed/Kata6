/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import branches.AmericanToyBusiness;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import business.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new AmericanToyBusiness();
        //ToyBusiness business = new AsianToyBusiness();
        ArrayList<AmericanCarToy> cars = new ArrayList<>();
        ArrayList<AmericanHelicopterToy> helicopters = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                if (line.equals("car")){
                    AmericanCarToy car = (AmericanCarToy) business.createToy("car");
                    cars.add(car);
                    System.out.println(
                               "Built cars: " + cars.stream()
                                .map(c -> c.toString())
                                .collect(Collectors.joining(",")));
                }
                else if (line.equals("helicopter")){
                    AmericanHelicopterToy helicopter = (AmericanHelicopterToy) business.createToy("helicopter");
                    helicopters.add(helicopter);
                    System.out.println(
                               "Built helicopters: " + helicopters.stream()
                                .map(h -> h.toString())
                                .collect(Collectors.joining(",")));
                } else {
                    System.out.println("Command unknown!");
                }
            }
        }
    }
}
    

