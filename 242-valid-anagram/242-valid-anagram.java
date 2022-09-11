class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        for(char c:s.toCharArray()){
            alpha[c-'a']++;
            
        }
        for(char c:t.toCharArray()){
            if(alpha[c-'a']!=0)
                alpha[c-'a']--;
            else 
                return false;
        }
        //System.out.println(alpha.length);
        for(int i=0;i<26;i++){
            if(alpha[i]!=0)
                return false;
        }
        return true;
        
            
    }
}