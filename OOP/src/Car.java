public class Car extends Vehicle{

//    Car has-an Engine
    Engine engine;




//    Car is-a vehicle

    public Car(int modelYear, String companyName, Engine engine) {
        super(modelYear, companyName);
        this.engine = engine;
    }

    public void StartCar(){
        System.out.println("Car Started");
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 5000;
    }
}
