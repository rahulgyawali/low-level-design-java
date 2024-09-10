package designpatterns.structural.composite.with.calculator;

public class Expression implements ArithemeticExpression {

    ArithemeticExpression leftExpression;
    ArithemeticExpression rightExpression;
    Operation operation;

    public Expression(ArithemeticExpression leftExpression, ArithemeticExpression rightExpression, Operation operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate(){
        int val = 0;
        switch (operation){
            case ADD -> val = leftExpression.evaluate()+ rightExpression.evaluate();
            case MULTIPLY -> val = leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE -> val = leftExpression.evaluate()/ rightExpression.evaluate();
            case SUBTRACT -> val = leftExpression.evaluate() - rightExpression.evaluate();
        }
        System.out.println("Expression value is "+val);
        return val;
    }
}
