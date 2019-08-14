package Flyweight;

class MyPool {
    java.util.HashMap pool = new java.util.HashMap();

    void putPerson(Person person){
        pool.put(person.job, person);
    }

    Person getPerson(String job, String name){
        Person result = (Person) pool.get(job);
        if( result == null ){
            //If there is no Object yet
            //Create new Object and add to HashMap
            result = new Person(job);
            pool.put(job, result);
        }
        //Changing the name of the shared object
        result.name = name;
        return result;
    }
}