class Solution {
    public String convert(String s, int numRows) {
       if(numRows<=1 || numRows>=s.length() || s==null)
            return s;

        int zigSpan = (numRows-1)*2;
        String res = "";

        for(int i=0;i<numRows;i++) {
            for(int j=i;j<s.length();j+=zigSpan) {
                //add every element for each column and the span is zigSpan
                res += s.charAt(j);
                
                 if(i!=0 && i!=numRows-1 && zigSpan+j-2*i<s.length()) res += s.charAt(zigSpan+j-2*i);
            }
        }
        return res; 
    }
}