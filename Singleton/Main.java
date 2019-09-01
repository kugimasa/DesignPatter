class Main {
    public static void main(String args[]) {
        Object object1 = Object.getInstance();
        // object2 is the same Singleton Object as object1
        Object object2 = Object.getInstance();
    }
}