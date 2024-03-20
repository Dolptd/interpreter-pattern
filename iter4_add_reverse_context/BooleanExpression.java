// abstract class BooleanExpression implements Expression {
//     @Override
//     public abstract int interpret(Context context);
// }

//Terminal Expression
public class BooleanExpression implements Expression<Boolean>{
    private Boolean boolValue;
    
    public BooleanExpression(boolean boolValue) {
        this.boolValue = boolValue;
    }
    
    public Boolean interpret(Context context){
        return boolValue;
    }
}
