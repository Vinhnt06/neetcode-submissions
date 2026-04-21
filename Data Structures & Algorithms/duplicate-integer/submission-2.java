class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Sắp xếp mảng tăng dần
        Arrays.sort(nums);
        
        // Quét 1 vòng kiểm tra 2 số đứng cạnh nhau
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Cứ đứng cạnh nhau mà bằng nhau là có trùng
            }
        }
        
        return false;
    }
}