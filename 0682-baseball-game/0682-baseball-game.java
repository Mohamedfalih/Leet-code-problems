class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String str : operations) {

            if (str.equals("+")) {
                int first = st.pop();
                int second = st.peek();
                int third = first + second;
                st.push(first);
                st.push(third);
            } else if (str.equals("C")) {
                st.pop();
            } else if (str.equals("D"))
                st.push(st.peek() * 2);

            else {
                st.push(Integer.parseInt(str));
            }
        }
        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }

        return result;
    }
}