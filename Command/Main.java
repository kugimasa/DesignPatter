class Main{
    public static void main(String args[]){
        MyService service = new MyService();

        MyRequest request = new MyRequest1();
        service.putRequest(request);
    }
}