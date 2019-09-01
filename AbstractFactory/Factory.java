class AlexFactory extends Factory {
    Person createPerson() { return new Alex(); }
    Computer createComputer() { return new MacBookAir(); }
}

class BobFactory extends Factory {
    Person createPerson() { return new Bob(); }
    Computer createComputer() { return new MicrosoftSurface(); }
}

abstract class Factory {
    //Two Factory Methods
    abstract Person createPerson();
    abstract Computer createComputer();

    static Factory getFactory(String owner) {
        if( owner.equals("Alex") ){
            return new AlexFactory();
        } else if ( owner.equals("Bob") ){
            return new BobFactory();
        } else  {
            return null ;
        }
    }
} 