public class codetest {

    public static void main(String[] args) {

//        Abstraction === Composition

//        The composition is a way to design or implement a relation.
//        So, composition and inheritance both are design technique.

//        Inheritance: is used to implement the "is-a" relationship
//        Composition : is used to implement the "has-a" relationship


        Point center = new Point(5, 10);
        Circle c1 = new Circle(center, 10);

        System.out.println(c1.CalculateArea());

        Circle c2 = new Circle(5, 5, 10);
        System.out.println(c2.CalculateArea());
    }

}
