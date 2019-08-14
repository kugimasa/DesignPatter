package Flyweight;

class Main {
    public static void main(String args[]){
        MyPool pool = new MyPool();

        Person person1 = new Person("Boss");
        Person person2 = new Person("Chief");
        Person person3 = new Person("Employee");
        pool.putPerson(person1);
        pool.putPerson(person2);
        pool.putPerson(person3);

        Person Alex = pool.getPerson("Boss", "Alex");
        printPerson(Alex);
        Person Bob = pool.getPerson("Chief", "Bob");
        printPerson(Bob);
        Person Cindy = pool.getPerson("Chief", "Cindy");
        printPerson(Cindy);
        Person Dave = pool.getPerson("Employee", "Dave");
        printPerson(Dave);
        Person Edwin = pool.getPerson("Employee", "Edwin");
        printPerson(Edwin);
    }

    static void printPerson(Person person){
        System.out.println(person.name+","+person.job);
    }
}