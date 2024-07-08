import java.util.Stack;

public class PostFixEvaluation {
    public static int evaluatePostFix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for(char ch: expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                
                    default:
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "231*+9-";
        int result = evaluatePostFix(expression);
        System.out.println("Result of postfix evaluation: " + result);
    }
}
