class Main {
    public static void main(String args[]) {
        Builder builder = new Builder();

        //Creating Person with Full Name
        FullName fullName = new FullName();
        Person alex = fullName.createPerson(builder);

        //Creating Person without Middle Name
        WithoutMiddleName withoutMiddleName = new WithoutMiddleName();
        Person alex2 = withoutMiddleName.createPerson(builder);
    }
}