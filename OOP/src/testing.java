public class testing {

    private static Car car1;

    public static void main(String[] args) {

/*
        inheritance is used to implement the "is-a" relationship
        composition is used to implement the "has-a" relationship
 This is the compostion relationship as car cannot be created without engine
*/

        Engine engine = new Engine(2018, "BENZ" );
        Car car = new Car(2021, "Mercrdes", engine);

        System.out.println(car1.engine.productionYear);
        System.out.println(car1.calculatePrice());


    }
}
