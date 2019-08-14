package Singleton;

class Object {
    static Object uniqueInstance;

    //Not using Constructor
    private Object() {
    }
    
    static Object getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Object();
        }
        return uniqueInstance;
    }
}