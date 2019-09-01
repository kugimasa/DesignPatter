class FullName {
    Person createPerson(Builder builder) {
        builder.addFirstName();
        builder.addMiddleName();
        builder.addLastName();
        return builder.getPerson();
    }
}

class WithoutMiddleName { 
    Person createPerson(Builder builder) {
        builder.addFirstName();
        builder.addLastName();
        return builder.getPerson();
    }
}