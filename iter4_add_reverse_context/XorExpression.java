// Composite Expression
class XorExpression implements Expression<Boolean> {
    private Expression<Boolean> leftExpression;
    private Expression<Boolean> rightExpression;

    public XorExpression(Expression<Boolean> leftExpression, Expression<Boolean> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Boolean interpret(Context context) {
        if (context._isReverse == ContextType.REVERSE) {
            return !((leftExpression.interpret(context)) ^ (rightExpression.interpret(context)));
        }
        // makng convenient use of the bitwise XOR operator(^) here
        return (leftExpression.interpret(context)) ^ (rightExpression.interpret(context));
    }
}
