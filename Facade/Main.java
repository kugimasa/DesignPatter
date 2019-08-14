package Facade;

class Main {
    public static void main(String args[]){
        //Without Facade class
        BookInfo info = new BookInfo();
        Book mybook = new Book();
        String id = info.getId();
        String title = mybook.getBook(id);
        System.out.println(title);
        //Using Facade class
        MyFacade facade = new MyFacade();
        title = facade.getBook();
        System.out.println(title);
    }
}