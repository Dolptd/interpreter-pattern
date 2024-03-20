public class IncrementExpression implements Expression {
    private Expression expression;

    public IncrementExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
        return (expression.interpret(context)) + 1;
    }
}
