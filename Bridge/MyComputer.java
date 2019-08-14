package Bridge;

class MyComputer {
    private MyPlatform platform;

    MyComputer(boolean isDescriptive){
        //createInstance is Factory Method
        platform = MyPlatform.createInstance(isDescriptive);
    }

    String getName() {
        return "MyComputer";
    }

    String getPlatform() {
        return platform.getPlatform();
    }

    String getVendor() {
        return platform.getVendor();
    }    
}

class MyComputerExt extends MyComputer {
    MyComputerExt(boolean isDescriptive){
        super(isDescriptive);
    }
    String getName(){
        return "MyComputer (Extended)";
    }
}