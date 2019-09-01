interface Operator {
    //Set the left operand
    void setLeftOperand(Operand operand);
    //Set the right operand
    void setRightOperand(Operand operand);
    //Calculate
    int calc();
}

interface Operand {
    //Return the value of operand
    public int getValue();
}

class IntOperand implements Operand {
    private int value;

    IntOperand(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

class Expression implements Operand {
    Operand left;
    Operator operator;
    Operand right;
    
    Expression(Operand left, Operator operator, Operand right){
        this.left = left;
        this.operator = operator;
        this.right = right;

        operator.setLeftOperand(left);
        operator.setRightOperand(right);
    }

    public int getValue(){
        return operator.calc();
    }
}

//Addition
class Addition implements Operator { 
    private Operand left;
    private Operand right;

    public void setLeftOperand(Operand left) {
        this.left = left;
    }

    public void setRightOperand(Operand right) {
        this.right = right;
    }

    public int calc(){
        return left.getValue() + right.getValue();
    }
}

//Subtraction
class Subtraction implements Operator {
        private Operand left;
    private Operand right;

    public void setLeftOperand(Operand left) {
        this.left = left;
    }

    public void setRightOperand(Operand right) {
        this.right = right;
    }

    public int calc(){
        return left.getValue() - right.getValue();
    }
}