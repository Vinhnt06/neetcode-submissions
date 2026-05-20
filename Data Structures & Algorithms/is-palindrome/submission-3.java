class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder z = new StringBuilder();
        for(char c :  s.toCharArray()){
            if(Character.isLetterOrDigit(c))
            z.append(Character.toLowerCase(c));
        }
        if(z.isEmpty()) return true;
        int start = 0;
        int end = z.length()-1;

        while(z.charAt(start) == z.charAt(end) && end > start){
            start++;
            end --;
            if(z.charAt(start) != z.charAt(end)) return false;
        }
        if(z.charAt(start) != z.charAt(end)) return false;
        return true;

    }
}
