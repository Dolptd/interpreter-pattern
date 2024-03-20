public class IncrementExpression implements Expression {
    private Expression expression;

    public IncrementExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Object interpret(Context context) {

        return ((Integer) expression.interpret(context)) + 1;
    }
}
