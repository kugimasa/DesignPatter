package Adapter;

class PersonA {
    private String firstName;
    private String lastName;

    PersonA(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class PersonB {
    String name;
    
    PersonB(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}