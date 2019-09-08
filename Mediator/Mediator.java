class Member {
    String name;

    Member(String name){
        this.name = name;
    }

    //Welcome when new Object added
    void memberAdded(String name){
        System.out.println(this.name+" : Welcome, "+name);
    }
}

class Mediator {
    java.util.Vector members = new java.util.Vector();

    void add(Member newMember){
        for(int i = 0; i < members.size(); i++){
            Member oldMember = (Member) members.elementAt(i);
            oldMember.memberAdded(newMember.name);
        }
        members.add(newMember);
    }
}