class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        int x=n;
        while(x != 1 && !set.contains(x)){
            set.add(x);
            int Ssum=0;
            while(x != 0){
                int last = x%10;
                Ssum += last*last;
                x /= 10;
            }
            x = Ssum;
        }
        return x==1;
    }
}