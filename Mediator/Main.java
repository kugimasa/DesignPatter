class Main{
    public static void main(String args[]){
        Mediator mediator = new Mediator();
        Member member1 = new Member("Alex");
        Member member2 = new Member("Bob");
        Member member3 = new Member("Chad");
        mediator.add(member1);
        mediator.add(member2);
        mediator.add(member3);
    }
}