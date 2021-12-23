/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import business.ToyBusiness;
import toyproduct.Toy;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new AmericanToyBusiness();
        //ToyBusiness business = new AsianToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            if (!line.equals("exit")){
                if ((line.equals("car")) || (line.equals("helicopter"))){
                    toys.add(business.createToy(line));
                    System.out.println(
                               "Built cars: " + toys.stream()
                                .map(c -> c.toString())
                                .collect(Collectors.joining(",")));
                }
                else {
                    System.out.println("Command unknown!");
                }
            }
        }
    }
}
    

