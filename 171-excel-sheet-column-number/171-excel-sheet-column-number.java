class Solution {
    public int titleToNumber(String columnTitle) {
        int len=columnTitle.length();
        
//         //If the length is more than 1
//         char firstChar = columnTitle.charAt(0);
//         //int value of first char
//         int finvalue = 26 * (int(firstChar - 'A')+1);
        
//         for(char c: columnTitle.toCharArray()){
//             int multiple = pow(26,len-1)
                
//         }
        int count =0;
        for(int i=0;i<len;i++){
            //26^len-1-i * int of char
            int value =columnTitle.charAt(i) - 'A';
            count+=Math.pow(26,len-1-i)*(value+1);
        }
        return count;
        
        
        
    }
}