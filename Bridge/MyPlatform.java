class MyPlatform {
    static MyPlatform createInstance(boolean isDescritive){
        if(isDescritive){
            return new MyPlatformExt();
        }else{
            return new MyPlatform();
        }
    }
    String getPlatform() {
        return "MacOS";
    }
    String getVendor() {
        return "Apple";
    }
}

class MyPlatformExt extends MyPlatform{
    String getPlatform() {
        return "MacOS (version 10.14.6)";
    }
    String getVendor() {
        return "Apple Califronia";
    }
}