class Main {
    public static void main(String args[]) {
        //Creating Hierarchy 
        Composite comp0 = new Composite("root");
        Composite comp1 = new Composite("comp1");
        Composite comp2 = new Composite("comp2");
        Composite comp3 = new Composite("comp3");
        comp0.addComposite(comp1);
        comp1.addComposite(comp2);
        comp2.addComposite(comp3);

        //Adding Leaf in the End
        Leaf leaf = new Leaf("leaf");
        comp3.addLeaf(leaf);

        view(comp0);

        view(leaf);
    }

    static void view(Object target){
        if(target instanceof Composite) {
            ((Composite) target).viewNames();
        } else if (target instanceof Leaf){
            ((Leaf) target).viewName();
        }
    }
}