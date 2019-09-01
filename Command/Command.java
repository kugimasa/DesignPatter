abstract class MyRequest {
    MyService service;

    void setService(MyService service){
        this.service = service;
    }

    abstract void procRequest();

}

class MyRequest1 extends MyRequest {
    void procRequest() {
        service.serviceA();
        service.serviceB();
    }
}

class MyRequest2 extends MyRequest {
    void procRequest() {
        service.serviceC();
        service.serviceA();
    }
}

class MyService {
    void putRequest(MyRequest request) {
        request.setService(this);
        //Executing request
        request.procRequest();
    }

    void serviceA(){
        System.out.println("Service A");
    }

    void serviceB(){
        System.out.println("Service B");
    }

    void serviceC(){
        System.out.println("Setvice C");
    }
}