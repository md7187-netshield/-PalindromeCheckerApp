void main() {

    String input = "madam";
    StringBuilder reversed = new StringBuilder();

    for (int i = input.length() - 1; i >= 0; i--) {
        reversed.append(input.charAt(i));
    }

    boolean isPalindrome = input.contentEquals(reversed);

    IO.println("Input text: " + input);
    IO.println("Reversed text: " + reversed);
    IO.println("Is it a Palindrome? : " + isPalindrome);
}
