class Solution {
    public boolean isAnagram(String s, String t) {
        // Nếu độ dài khác nhau thì chắc chắn sai
        if (s.length() != t.length()) return false;
        
        // Mảng 26 phần tử đại diện cho 26 chữ cái (a-z)
        int[] count = new int[26];
        
        // Duyệt 1 vòng duy nhất
        for (int i = 0; i < s.length(); i++) {
            // Chuỗi s có chữ gì thì CỘNG 1 vào vị trí đó
            count[s.charAt(i) - 'a']++; 
            // Chuỗi t có chữ gì thì TRỪ 1 ở vị trí đó
            count[t.charAt(i) - 'a']--; 
        }
        
        // Nếu là Anagram, mọi sự cộng trừ sẽ triệt tiêu nhau về 0
        for (int c : count) {
            if (c != 0) return false;
        }
        
        return true;
    }
}