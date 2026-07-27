class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> set = new HashMap<>();

        while (right < fruits.length) {
            set.put(fruits[right], set.getOrDefault(fruits[right], 0) + 1);
            int pop = fruits[left];

            while (set.size() > 2) {

                set.put(fruits[left], set.getOrDefault(fruits[left], 0) - 1);

                if (set.get(fruits[left]) <= 0) {
                    set.remove(fruits[left]);
                }
                left++;

            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;

        }
        return maxLen;
    }
}