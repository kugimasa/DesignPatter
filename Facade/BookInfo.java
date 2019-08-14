package Facade;

class BookInfo {
    String getId(){
        return "12345678";
    }
}

class Book{
    String getBook(String bookId){
        return "Learning Design Pattern with Java";
    }
}

//Facade class
class MyFacade{
    String getBook(){
        BookInfo info = new BookInfo();
        Book mybook = new Book();
        String id  = info.getId();
        return mybook.getBook(id);
    }
}