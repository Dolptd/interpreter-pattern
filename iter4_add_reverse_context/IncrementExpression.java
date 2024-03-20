public class IncrementExpression implements Expression<Integer> {
    private Expression<Integer> expression;

    public IncrementExpression(Expression<Integer> expression) {
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
        if (context._isReverse == ContextType.REVERSE) {
            return (expression.interpret(context)) - 1;
        }
        return (expression.interpret(context)) + 1;
    }
}
