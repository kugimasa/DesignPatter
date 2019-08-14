package AbstractFactory;

class Main {
    public static void main(String args[]) {
        //value inputed when executed
        Factory factory = Factory.getFactory(args[0]);

        Person person = factory.createPerson();
        Computer computer = factory.createComputer();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println(computer.getVendor());
        System.out.println(computer.getDate());
    }
}