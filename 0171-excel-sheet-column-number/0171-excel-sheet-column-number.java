class Solution {
    public int titleToNumber(String columnTitle) {
        
        int columnNumber = 0;
        int pow = 0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            columnNumber += (int) (columnTitle.charAt(i)-64)*Math.pow(26,pow);
            pow++;
        }
        return columnNumber;
    }
}