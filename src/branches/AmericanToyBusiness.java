package branches;

import business.ToyBusiness;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{

    @Override
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
}
