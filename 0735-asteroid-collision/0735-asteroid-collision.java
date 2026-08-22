class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < asteroids.length ; i++)
        {
            int curr = asteroids[i];
            boolean flag = false;

            while(!st.isEmpty() && st.peek() > 0 
                                &&  curr < 0)
            {
                int top = st.peek();

                if(Math.abs(curr) > Math.abs(top)){
                    st.pop();
                }
                else if(Math.abs(curr) == Math.abs(top)){
                    st.pop();
                    flag = true;
                    break;
                }
                else{
                    flag = true;
                    break;
                }

            }
            
            if(!flag){
                st.push(curr);
            }
            
        }

        int[] res = new int[st.size()];
        for(int i = res.length-1 ; i >= 0 ; i--){
            res[i] = st.pop();
        }

        return res;
                
    }
}