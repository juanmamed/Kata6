package business;

import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
/*    
    public Toy createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy hel = new AmericanHelicopterToy(this.generator.next());
                hel.pack();
                hel.label();
                return hel;
            default:
                return null;
        }
    }
*/
}
