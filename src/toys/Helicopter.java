/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys;

/**
 *
 * @author Juanma
 */
public class Helicopter {
    private Integer serialNumber;
    private final String type = "helicopter";
    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public String getType(){
        return type;
    }
    
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
}
