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
public class AsianCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
        AsianCarToy car = new AsianCarToy(serialNumber);
        return car;

    }
    
}
