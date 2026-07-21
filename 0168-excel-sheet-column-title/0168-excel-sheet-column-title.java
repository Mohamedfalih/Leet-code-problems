class Solution {
    public String convertToTitle(int columnNumber) {
        
        String title = "";

        while(columnNumber != 0){

            columnNumber--;

            int last = columnNumber % 26;
            title = (char)(last + 65) + title;
            columnNumber /= 26;
        }
        return title;
    }
}