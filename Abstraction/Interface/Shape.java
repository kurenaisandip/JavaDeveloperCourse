public interface Shape {



        //Code Sharing isn't useful in this case,
        //because each class implements its behavior
        //differently
    // As each element are different as given below:

//    Area                                          Perimeter
//    Circle:       Pi*r*r                          2 * pi * R
//    Rectangle:    length * width                  (w + l) * 2
//    Triangle:       heigth*base/2                  a + b + c


    // There is an error here, abstract method cannot have body={}

    // Tn abstract we only write header as it is unnecessary
//     public double CalculateArea();

    double CalculateArea();

    double CalculatePerimeter();

    // Inheritance: can only contain method headers and
    // class constants

    // What is Abstract method ??
    // A method that is declared as an interface but not implemented is called abstract class.
    // Abstract method represent that a class promises to implement what is implemented to interface.

    }


