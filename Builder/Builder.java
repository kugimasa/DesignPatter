class Builder {
    String name;

    void addFirstName() {
        name += "Alex";
    }

    void addMiddleName() {
        name += "Steve";
    }

    void addLastName() {
        name += "Smith";
    }

    Person getPerson() {
        Person result = new Person(name);
        name = "";
        return result;
    }
}