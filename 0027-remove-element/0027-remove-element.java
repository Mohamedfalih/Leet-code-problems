class Solution {
    public int removeElement(int[] nums, int val) {

        int size = nums.length;
        if(size==0)
            return 0;

        int i=0;
        for(int j=0;j<size;j++)
        {
            if(val!=nums[j])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}