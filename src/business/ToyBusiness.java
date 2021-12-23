package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

public class ToyBusiness {
    private final Map<String, ToyFactory> toyFactories = new HashMap<>();
    protected final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public void add(String type, ToyFactory toyFactory){
        this.toyFactories.put(type, toyFactory);
    }
    
    public Toy produceToy(String type){
        return toyFactories.get(type).produceToy(generator.next());
    }

}
