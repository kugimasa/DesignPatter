class Composite {
    private String name;
    Composite childComposite = null;
    Leaf childLeaf = null;

    Composite(String name){
        this.name = name;
    }

    void addComposite(Composite childComposite){
        this.childComposite = childComposite;
    }

    void addLeaf(Leaf childLeaf){
        this.childLeaf = childLeaf;
    }

    //recursively
    void viewNames(){
        System.out.println(name);
        if(childComposite != null){
            //if the child is a Composite
            childComposite.viewNames();
        } else if (childLeaf != null){
            //if the child is a Leaf
            childLeaf.viewName();
        }
    }
}