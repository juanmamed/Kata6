/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyproduct.models;

import toyproduct.Toy;

/**
 *
 * @author Juanma
 */
public class HelicopterToy implements Toy {
    private Integer serialNumber;
    private final String type = "helicopter";
    public HelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public String getType(){
        return type;
    }
    
    @Override
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
}
