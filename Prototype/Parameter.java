package Prototype;

class Parameter implements Cloneable {
    public int value;
    
    Parameter(int value){
        this.value = value;
    }

    public Object clone() throws CloneNotSupportedException {
        //calling method "clone()" from Object Class
        //returns Object having the same value
        return super.clone();
    }
}