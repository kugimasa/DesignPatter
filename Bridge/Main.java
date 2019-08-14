package Bridge;

class Main {
    public static void main(String args[]) {
        MyComputer myComputer;

        myComputer = new MyComputer(false);
        System.out.println(myComputer.getName());
        System.out.println(myComputer.getPlatform());
        System.out.println(myComputer.getVendor());

        myComputer = new MyComputer(true);
        System.out.println(myComputer.getName());
        System.out.println(myComputer.getPlatform());
        System.out.println(myComputer.getVendor());

        myComputer = new MyComputerExt(false);
        System.out.println(myComputer.getName());
        System.out.println(myComputer.getPlatform());
        System.out.println(myComputer.getVendor());

        myComputer = new MyComputerExt(true);
        System.out.println(myComputer.getName());
        System.out.println(myComputer.getPlatform());
        System.out.println(myComputer.getVendor());
    }
}