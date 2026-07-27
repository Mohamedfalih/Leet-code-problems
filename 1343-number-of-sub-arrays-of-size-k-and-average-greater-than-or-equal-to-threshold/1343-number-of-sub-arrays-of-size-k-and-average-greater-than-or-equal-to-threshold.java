class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int left = 0;
        int right = k - 1;
        int sum = 0;
        int subArray = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if ((sum / k) >= threshold) {
            subArray++;
        }

        while (right < arr.length - 1) {

            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];

            if ((sum / k) >= threshold) {
                subArray++;
            }
        }
        return subArray;
    }
}