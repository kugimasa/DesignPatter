package Adapter;

class Main {
    public static void main(String args[]){
        PersonA person = new PersonA("Alex","Smith");
        Adapter adapter = new Adapter(person); 
    
        Viewer viewer = new Viewer();
        viewer.viewName(adapter);
    }
}