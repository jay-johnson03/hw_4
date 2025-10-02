import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {
        double n = 6;
        double loop = 1000000;

        for (double i = 0; i < loop; i++) {
            // Start with an empty string for this trial.
            String string = "";
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < 10; j++) {
                // Append either '(' or ')' randomly.
                string += (Math.random() < 0.5) ? "(" : ")";
                if (string.charAt(j) == '(') {
                    // If it's '(', push it onto the stack.
                    stack.push('(');
                } else {
                    // If it's ')', we need to find a matching '('. 
                    // stack is not empty and we have one, pop it.
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        // If there is no matching '(', we push ')'
                        // it continues
                        stack.push(')');
                        break;
                    }
                }

                // If the stack is empty now, every '(' that has a matching ')' so it's balanced.
                // then we increment n to count this. 
                if (stack.isEmpty()) {
                    n++;
                }
                // getting the average number of balanced 
                System.out.println((n / i));
            }
        }
    }
}
