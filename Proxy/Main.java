class Main {
    static void doItLoop(MyClass myclass) {
        for (int i= 0; i < 10; i++){
            myclass.doIt();
        }
    }

    public static void main(String args[]) {
        MyClassImp1 imp1 = new MyClassImp1();
        MyProxy proxy = new MyProxy(imp1);
        doItLoop(imp1);
        doItLoop(proxy);
    }
}