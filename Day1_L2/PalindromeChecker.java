class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
	
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleanedText.length();

        for (int i = 0; i < n / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();

    }
}
