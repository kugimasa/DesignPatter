package Decorator;

class Main {
    public static void main(String args[]){
        //Using Alex
        MyNameImp1 alex = new MyNameImp1();
        printName(alex);
        //Using Bob
        MyNameImp2 bob = new MyNameImp2();
        printName(bob);
        //Decorating Alex
        MyDecorator decoratedAlex = new MyDecorator(alex);
        printName(decoratedAlex);
        //Decorating Bob
        MyDecorator decoratedBob = new MyDecorator(bob);
        printName(decoratedBob);
        //Decorating decorated Alex
        MyDecorator decoratedAlex2 = new MyDecorator(decoratedAlex);
        printName(decoratedAlex2);
    }

    static void printName(MyName target){
        System.out.println(target.getName());
    }
}