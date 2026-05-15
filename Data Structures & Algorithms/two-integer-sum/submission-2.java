class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] kq = new int[2];
        int index = 0;
        while(index < nums.length){
        for(int i = index +1 ; i < nums.length;i++){
            if(nums[index]+nums[i]== target){
                kq[0] = index;
                kq[1] = i;
                return kq;
            }
            
        }
        index++;
        }
        return kq;
    }
}
