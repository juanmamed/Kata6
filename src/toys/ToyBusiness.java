package toys;

import toyproduct.Toy;
import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;

public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy hel = new HelicopterToy(this.generator.next());
                hel.pack();
                hel.label();
                return hel;
            default:
                return null;
        }
    }
}
