package designpatterns.structural.composite.with.calculator;

public class Number implements ArithemeticExpression {

    int val;

    public Number(int val){
        this.val = val;
    }

    @Override
    public int evaluate(){
        System.out.println("The value is "+val);
        return this.val;
    }
}
