// Terminal Expressions
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(Integer number) {
        this.number = number; // auto-unboxing
    }

    @Override
    public Object interpret(Context context) {
        return ((Integer) number); // auto-boxing
    }
}
