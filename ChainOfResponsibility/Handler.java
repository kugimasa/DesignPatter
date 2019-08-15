class HandlerA {
    HandlerB next;

    HandlerA(){
        next = new HandlerB();
    }

    void doIt(int param){
        if(param > 0) {
            System.out.println("Do it by HandlerA");
        }
        next.doIt(param);
    }
}

class HandlerB{
    HandlerC next;

    HandlerB(){
        next = new HandlerC();
    }

    void doIt(int param){
        if(param % 2 == 0){
            System.out.println("Do it by HandlerB");
        }
        next.doIt(param);
    }
}

class HandlerC{
    void doIt(int param){
        if(param < 100){
            System.out.println("Do it by HandlerC");
        }
    }
}