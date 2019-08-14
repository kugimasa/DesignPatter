package AbstractFactory;

abstract class Computer {
    abstract String getVendor();
    abstract String getDate();
}

class MacBookAir extends Computer {
    String getVendor() {return "Apple"; }
    String getDate() { return "2008/1/15"; }
}

class MicrosoftSurface extends Computer {
    String getVendor() { return "Windows"; }
    String getDate() {return "2012/6/18"; }
}