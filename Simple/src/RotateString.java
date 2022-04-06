public class RotateString {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                if (s.regionMatches(i, goal, 0, s.length() - i) && s.regionMatches(0, goal, s.length() - i, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean rotateStringMark(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);
    }

}
