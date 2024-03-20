// The main classClient
// Polymorphism? 
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression addexpression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));

        Expression incrementExpression = new IncrementExpression(new NumberExpression(10));
        Expression randExpression1 = new RandomExpression(new NumberExpression(6));
        Expression randExpression2 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));
        Expression xorExpression = new XorExpression(new XorExpression(new BooleanExpression(true),
                new BooleanExpression(false)),
                new XorExpression(new BooleanExpression(true),
                        new BooleanExpression(true)));

        // Create the context, if needed
        Context context = new Context();
        // Interpret the expression
        System.out.println("Add Result: " + addexpression.interpret(context)); // Output: Result: 9
        System.out.println("Increment Result: " + incrementExpression.interpret(context)); // Output: Result: 11
        System.out.println("Random Result1: " + randExpression1.interpret(context)); // Output: [0,5]
        System.out.println("Random Result2: " + randExpression2.interpret(context)); // Output: [3,5]
        System.out.println("XOR Result3: " + xorExpression.interpret(context)); // Output: true

        System.out.println();

    }
}
