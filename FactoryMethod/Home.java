package FactoryMethod;

abstract class Home {
    abstract String getAddress();
    abstract int getFloor();
}

class AlexHome extends Home {
    String getAddress() { return "California"; }
    int getFloor() { return 2; }
}
class BobHome extends Home {
    String getAddress() { return "Texas"; }
    int getFloor() { return 1; }
}