package FactoryMethod;

class Main {
    public static void main(String args[]) {
        Person bob = new Bob();

        //Calling Factory Method
        Home bobhome = bob.createHome();

        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bobhome.getAddress());
        System.out.println(bobhome.getFloor());
    }
}