class Solution {
    public boolean checkString(String s) {
        boolean bfound = false;
        for(char c:s.toCharArray()){
            if(c=='a'&&bfound==true)
                return false;
            else if(c=='b')
                bfound=true;
        }
        return true;
    }
}