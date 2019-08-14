package AbstractFactory;

abstract class Person {
    abstract String getName();
    abstract int getAge();
}
class Alex extends Person {
    String getName() { return "Alex"; }
    int getAge() { return 20; }
}

class Bob extends Person {
    String getName() { return "Bob"; }
    int getAge() { return 30; }
}