import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else if ((c == ')' && stack.peek() == '(') ||
                           (c == ']' && stack.peek() == '[') ||
                           (c == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }
    }
}
