
// Random Expression
// Composite Expression
import java.util.Random;

public class RandomExpression implements Expression<Integer> {
    private Expression<Integer> leftExpression;
    private Expression<Integer> rightExpression;

    public RandomExpression(Expression<Integer> leftExpr, Expression<Integer> rightExpr) {
        this.leftExpression = leftExpr;
        this.rightExpression = rightExpr;
    }

    public RandomExpression(Expression<Integer> rightExpr) {
        this(new NumberExpression(0), rightExpr);
    }

    public RandomExpression() {
        this(new NumberExpression(0), new NumberExpression(Integer.MAX_VALUE));
    }

    @Override
    public Integer interpret(Context context) {
        Random rand = new Random();
        int leftValue = leftExpression.interpret(context);
        int rightValue = rightExpression.interpret(context);
        int minValue = Math.min(leftValue, rightValue);
        int maxValue = Math.max(leftValue, rightValue);

        return minValue + rand.nextInt(maxValue - minValue);
    }
}
