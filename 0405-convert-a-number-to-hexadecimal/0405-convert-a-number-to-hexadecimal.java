class Solution {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        if(num<0){
            int arr[] = new int[32];
            for(int i=0 ; num != 0;i++){
                arr[i] = num%2;
                num /= 2;
            }
            
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            for(int i=0 ; i<32 ; i++){
                if(arr[i] == 0){
                    arr[i] =1;
                }
                else
                    arr[i]=0;
            }
            int carry=1;
            for(int i=31;i>=0;i--){
                if(carry == 1){
                    if(arr[i] ==1)
                    {
                        arr[i]=0;
                    }else{
                        arr[i]= arr[i]+carry;
                        carry=0;
                    }
                }
            }
            String hex = "";
            int j=0,sum=0;
            for(int i=31;i>=0;i--){
                sum+=(arr[i]*Math.pow(2,j));
                j++;
                if(j%4 == 0){
                    System.out.println(sum);
                    if(sum<10){
                        hex = sum + hex;
                    }else{
                        hex = (char)(sum+87) + hex;
                    }
                    sum=0;
                    j=0;
                }
            }

           return hex;

        }
        else{
            String hex = "";
            int org = num;

            while(num != 0){
                int rem = num%16;
                if(rem>9){
                    hex = (char)(rem+87) + hex;
                }else{
                   hex = rem + hex;
                }
             
               num/=16;
            }
            return hex;
        }
        
    }
}