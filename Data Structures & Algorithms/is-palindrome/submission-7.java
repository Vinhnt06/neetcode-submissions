class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder z = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                z.append(Character.toLowerCase(c));
            }
        }
        String cleaned = z.toString();
        return cleaned.equals(z.reverse().toString());
    }
}
