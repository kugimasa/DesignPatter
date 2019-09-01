class Composite implements Node{
    private String name;
    Node childNode = null;
    /*
    Composite childComposite = null;
    Leaf childLeaf = null;
    */

    Composite(String name){
        this.name = name;
    }

    /*
    void addComposite(Composite childComposite){
        this.childComposite = childComposite;
    }

    void addLeaf(Leaf childLeaf){
        this.childLeaf = childLeaf;
    }
    */

    void addNode(Node childNode){
        this.childNode = childNode;
    }

    //recursively
    public void viewNames(){
        System.out.println(name);
        if(childNode != null){
            childNode.viewNames();
        }
        /*
        if(childComposite != null){
            //if the child is a Composite
            childComposite.viewNames();
        } else if (childLeaf != null){
            //if the child is a Leaf
            childLeaf.viewName();
        }
        */
    }
}