/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    
    
    public Toy produceToy(Integer serialNumber) {
        Toy toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(Integer serialNumber);
}
