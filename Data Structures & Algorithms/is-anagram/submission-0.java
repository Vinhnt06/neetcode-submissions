class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] z = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(z);
        Arrays.sort(tt);

        return Arrays.equals(z,tt);
        
        
       

    }
}
