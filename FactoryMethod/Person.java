package FactoryMethod;

abstract class Person {
    abstract String getName();
    abstract int getAge();
    //Factory Method
    abstract Home createHome();
}
class Alex extends Person {
    String getName() { return "Alex"; }
    int getAge() { return 20; }
    Home createHome() { return new AlexHome();}
}

class Bob extends Person {
    String getName() { return "Bob"; }
    int getAge() { return 30; }
    Home createHome() { return new BobHome();}
}