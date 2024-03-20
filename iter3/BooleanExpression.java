// abstract class BooleanExpression implements Expression {
//     @Override
//     public abstract int interpret(Context context);
// }

//Terminal Expression
public class BooleanExpression implements Expression {
    private Boolean boolValue;

    public BooleanExpression(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public Object interpret(Context context) {
        return (Boolean) boolValue;
    }
}
