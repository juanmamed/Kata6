package toys;

public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();

    public Car createCar(){
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter hel = new Helicopter(this.generator.next());
        hel.pack();
        hel.label();
        return hel;
    }
}
