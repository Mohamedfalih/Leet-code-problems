class Solution {
    public void duplicateZeros(int[] arr) {
        
        int l = 0;
        int r = arr.length-1;

        while(l < r){

            if(arr[l] == 0){

                while(l < r){
                    arr[r] = arr[r-1];
                    r--; 
                }
                arr[r] = 0;
                l++;
                r = arr.length-1;
            }
           l++;
        }
    }
}