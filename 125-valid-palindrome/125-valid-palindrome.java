class Solution {
    public boolean isPalindrome(String s) {
        // String fixed="";
        // for(char c: s.toCharArray()){
        //     if(Character.isDigit(c)||Character.isLetter(c))
        //         fixed+=c;
        // }
        // fixed=fixed.toLowerCase();
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start)))
            start++;
            
            while(start<end && !Character.isLetterOrDigit(s.charAt(end)))
            end--;
            
            if(s.charAt(start)!=s.charAt(end)){
                return false;
                
            }
            start++;
            end--;
        }
        return true;
        
    }
}