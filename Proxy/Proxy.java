interface MyClass {
    void doIt();
}

class MyClassImp1 implements MyClass {
    public void doIt() {
        System.out.println("Do it !!");
    }
}

class MyProxy implements MyClass {
    MyClass myclass;
    boolean flag = true;

    MyProxy(MyClass myclass) {
        this.myclass = myclass;
    }

    public void doIt() {
        if (flag) {
            myclass.doIt();
        } else {
            // do nothing
        }
        flag = !flag;
    }
}