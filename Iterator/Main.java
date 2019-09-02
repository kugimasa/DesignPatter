class Main {
    public static void main(String args[]) {
        MyData data1 = new MyData("Data1");
        MyData data2 = new MyData("Data2");
        MyData data3 = new MyData("Data3");

        //iterator API
        java.util.HashSet hashSet = new java.util.HashSet();
        hasSet.add(data1);
        hasSet.add(data2);
        hasSet.add(data3);    

        java.util.Iterator iter = hashSet.iterator();
        while ( iter.hasNext() ){
            MyData next = (MyData) iter.next();
            System.out.println(next.name);
        }
    }
}