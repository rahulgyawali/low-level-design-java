package designpatterns.structural.composite.with.calculator;

public class Client {
    public static void main(String[] args) {
        /**
         *  Example 2*(1+7)
         */

        ArithemeticExpression two = new Number(2);
        ArithemeticExpression one = new Number(1);
        ArithemeticExpression seven =  new Number(7);
        ArithemeticExpression addExpression = new Expression(one,seven,Operation.ADD);
        ArithemeticExpression multiplyExpression = new Expression(addExpression,two,Operation.MULTIPLY);
        System.out.println(multiplyExpression.evaluate());
    }
}
