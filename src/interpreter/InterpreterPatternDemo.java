package interpreter;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression(){
        Expression rebert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(rebert,john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression rebert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(rebert,john);
    }

    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();
        Expression marriedWomanExpression = getMarriedWomanExpression();

        System.out.println("John is male? " + maleExpression.interpret("John"));
        System.out.println("Julie is a married women? "
                + marriedWomanExpression.interpret("Married Julie"));
    }
}
