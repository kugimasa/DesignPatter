package Decorator;

class MyDecorator implements MyName {
    MyName target;
    MyDecorator(MyName target){
        this.target = target;
    }

    public String getName(){
        String result = "!";
        result += target.getName();
        result += "!";
        return result;
    }
}