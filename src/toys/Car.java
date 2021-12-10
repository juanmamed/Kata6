/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys;

public class Car {
   private Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public void pack() {
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling car '%d'\n", this.serialNumber);
    }
}
