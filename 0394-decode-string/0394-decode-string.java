class Solution {
    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<String> ch = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                int number = 0;

                // Handle multi-digit numbers like 12[a]
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }

                num.push(number);
                i--;

            } else if (s.charAt(i) != ']') {

                ch.push(String.valueOf(s.charAt(i)));

            } else {

                String str = "";
                
                while (!ch.peek().equals("[")) {
                    str = ch.pop() + str;
                }
                ch.pop();

                int count = num.pop();

                String temp = "";
                for (int j = 0; j < count; j++) {
                    temp += str;
                }

                ch.push(temp);
            }
        }

        String result = "";

        while (!ch.isEmpty()) {
            result = ch.pop() + result;
        }

        return result;
    }
}