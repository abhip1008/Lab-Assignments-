public class Palindromes {
    public static void printReverse(String target) {
        LinkedStack stack = new LinkedStack();
        for(int i = 0; i < target.length(); i++) {
            stack.push(target.charAt(i));
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void printReverseRec(String target) {
        if(target.length() <= 1) {
            System.out.print(target);
            return;
        }
        System.out.print(target.charAt(target.length() - 1));
        printReverseRec(target.substring(0, target.length() - 1));
    }

    public static boolean isPalindrome(String text) {
        String cleaned = "";

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }

        LinkedStack stack = new LinkedStack();

        for(int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }
        String reversed = "";
        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return cleaned.equals(reversed);

    }

    public static boolean isPalindromeRec(String text) {
        String cleaned = "";

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }
        return isPalindromeRecHelper(cleaned);
    }

    private static boolean isPalindromeRecHelper(String text) {
        if(text.length() <= 1) {
            return true;
        }
        if(text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecHelper(text.substring(1, text.length() -1));
    }
}