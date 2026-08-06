class Solution {
    public int smallestNumber(int n, int t) {

        int digiProd = 1;
        for (int i = n; i <= 100; i++) {
            int temp = i;
            while (temp != 0) {
                digiProd *= temp % 10;
                temp /= 10;
            }
            if (digiProd % t == 0) {
                return i;
            }
            digiProd = 1;
        }
        return 0;
    }
}