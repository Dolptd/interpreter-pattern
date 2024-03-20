// Client
public class Application {
        public static void main(String[] args) {
                // Create the expression: (2 + 3) + 4
                Expression addexpression = new AddExpression(
                                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                                new NumberExpression(4));

                // Create the context, if needed
                Context context = new Context();
                // Interpret the expression
                System.out.println("Add Result: " + addexpression.interpret(context)); // Output: Result: 9

                System.out.println();
        }
}