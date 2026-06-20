/*
he string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
*/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String ans[]=new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int indx=0;indx<numRows && i<s.length();indx++){
                ans[indx]+=s.charAt(i++);
            }
            for(int indx=numRows-2;indx>0 && i<s.length();indx--){
                ans[indx]+=s.charAt(i++);
            }
        }
        String result = "";
        for(int j = 0; j < numRows; j++){
            result += ans[j];
        }
        return result;
    }
}
