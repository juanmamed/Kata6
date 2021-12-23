/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
            switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                return car;
            case "helicopter":
                AmericanHelicopterToy hel = new AmericanHelicopterToy(this.generator.next());
                return hel;
            default:
                return null;
        }
    }
    
}
