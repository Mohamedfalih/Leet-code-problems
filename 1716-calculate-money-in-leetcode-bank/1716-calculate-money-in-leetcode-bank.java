class Solution {
    public int totalMoney(int n) {

        int sum = 0;
        int week = 1;
        int days = 0;

        while (days < n) {

            for (int i = week; i <= week + 6 && days < n; i++) {
                sum += i;
                days++;
            }

            week++;
        }

        return sum;
    }
}