import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {

        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (charStack.empty() || this.match(s.charAt(i)) == s.charAt(i) || charStack.peek() != this.match(s.charAt(i))) {
                charStack.push(s.charAt(i));
            } else {
                charStack.pop();
            }
        }
        return charStack.empty();
    }

    public char match(char ch) {
        return switch (ch) {
//            case '(' -> ')';
            case ')' -> '(';
//            case '[' -> ']';
            case ']' -> '[';
//            case '{' -> '}';
            case '}' -> '{';
            default -> ch;
        };
    }

}
