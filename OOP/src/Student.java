public  class Student {
    public String name;

//    class
//    is characterstic of java
//    are blueprints or templates for objects
//    are used to describe types of entities

//    Objects are living entities created from a class as they contain certain states within
//    fields and present certain behaviours with the methods.

//          States
            private String name;
            private int age;
            private String color;
            private char sex;  // M or F

            private static int id = 0;  // Ex10 Static and Non-Static

//          Behaviour
//        Method: is a block of code
//        Which only runs when it is called.

    public void Eating(){
        System.out.println("Eating");
    }

    public void Drinking(){
        System.out.println("Drinking");
    }

    public void Running(){
        System.out.println("Runnning");
    }


//    Constructor


//    Default constructor
//    alt + insert ( But it is not working as this doesnot has a seperate insert button)
        public Student(){

        }

//    full State Constructor
    public Student(String name, int age, String color, char sex)
    {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
        id++;  //This will increase id by 1 every time as I create an object from Student
        //       and we can put id with passing
//               the parameters inthe constructor as it is staic and
//               and shared among all the class
    }

//    Getters
//    The get method returns the variable value.

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public char getSex(){
        return sex;
    }


    public int getId(){
        return id;
    }
//    Setter
//    The set method sets the value.
//    All setter start with void

    public void setName(String newName ){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setSex(char newSex){
        this.sex = newSex;
    }


} // end of the class
