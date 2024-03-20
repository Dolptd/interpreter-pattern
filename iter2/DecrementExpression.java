public class DecrementExpression implements Expression {
    private Expression expression;

    public DecrementExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
        return (expression.interpret(context)) - 1;
    }
}
