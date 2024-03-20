public class DecrementExpression implements Expression {
    private Expression expression;

    public DecrementExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Object interpret(Context context) {

        return ((Integer) expression.interpret(context)) - 1;
    }
}
