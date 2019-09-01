class Main{
    public static void main(String args[]) {
        // 5 - (3 + 4)
        IntOperand op1 = new IntOperand(5);
        Subtraction sub = new Subtraction();
        IntOperand op2 = new IntOperand(3);
        Addition add = new Addition();
        IntOperand op3 = new IntOperand(4);
        Expression exp1 = new Expression(op2, add, op3);
        Expression exp2 = new Expression(op1, sub, exp1);

        System.out.println(exp2.getValue());
    }
}