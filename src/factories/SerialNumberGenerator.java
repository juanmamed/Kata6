/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

/**
 *
 * @author Juanma
 */
public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    
    public Integer next(){
        return this.serialNumber++;
    }
}
