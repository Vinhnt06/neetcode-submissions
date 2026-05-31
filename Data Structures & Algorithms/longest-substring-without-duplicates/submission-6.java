class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        if (s.length() == 1)
            return 1;
        int maxlength = 0;
        int left = 0;
        Set<Character> z = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while(z.contains(s.charAt(i))){
                z.remove(s.charAt(left));
                left++;
                
                }
            z.add(s.charAt(i));
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
    }
}
// d v d f
