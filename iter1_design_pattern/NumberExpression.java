// Terminal Expressions
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public Integer interpret(Context context) {
        return number;
    }
}
