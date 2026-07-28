class Solution {
    public int removeDuplicates(int[] nums) {
        int unq=1,i=0,j=1,n=nums.length;
        while(i<j && j<n){
            if(nums[i]==nums[j]){
                j++;
            }else if(nums[i]<nums[j]){
                nums[i + 1] = nums[j];
                i++;
                j++;
                unq++;
            }
        }
        return unq;
    }
}