/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    protected final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(String type) {
        Toy toy = this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(String type);
}
