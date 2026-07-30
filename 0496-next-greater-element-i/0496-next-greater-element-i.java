class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();

        HashMap<Integer,Integer> nge = new HashMap<>();

        for(int i = nums2.length-1 ; i >= 0 ; i--)
        {
            while(!st.isEmpty() && st.peek() < nums2[i])
                st.pop();

            nge.put(nums2[i] , st.isEmpty() ? -1 : st.peek());

            st.push(nums2[i]);
        }

        //result

        for(int i = 0 ; i < nums1.length ; i++)
        {
            nums1[i] = nge.get(nums1[i]);
        }

        return nums1;

    }
}