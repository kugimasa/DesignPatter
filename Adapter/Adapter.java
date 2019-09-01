class Adapter extends PersonB {
    PersonA person;

    Adapter(PersonA person){
        //dummy of PersonB constructer
        super(null);
        this.person = person; 
    }

    String getName() {
        return person.getFirstName() + " " + person.getLastName();
    }
}