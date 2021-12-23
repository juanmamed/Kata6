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
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

/**
 *
 * @author Juanma
 */
public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                return car;
            case "helicopter":
                AsianHelicopterToy hel = new AsianHelicopterToy(this.generator.next());
                return hel;
            default:
                return null;
        }
    }
    
}
