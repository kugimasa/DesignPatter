class Main {
    public static void main(String args[]) {
        //Creating Hierarchy 
        Composite comp0 = new Composite("root");
        Composite comp1 = new Composite("comp1");
        Composite comp2 = new Composite("comp2");
        Composite comp3 = new Composite("comp3");
        comp0.addNode(comp1);
        comp1.addNode(comp2);
        comp2.addNode(comp3);

        //Adding Leaf in the End
        Leaf leaf = new Leaf("leaf");
        comp3.addNode(leaf);

        view(comp0);

        view(leaf);
    }

    static void view(Node target){
        /*
        if(target instanceof Composite) {
            ((Composite) target).viewNames();
        } else if (target instanceof Leaf){
            ((Leaf) target).viewName();
        }
        */
        target.viewNames();
    }
}