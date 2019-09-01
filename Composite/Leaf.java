class Leaf implements Node{
    private String name;

    Leaf(String name){
        this.name = name;
    }

    public void viewNames(){
        System.out.println(name);
    }
}