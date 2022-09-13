class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=1;i<words.length;i++){
            if(compare(words[i-1],words[i],order)>0)
                return false;
        }
        return true;
        
    }
    int compare(String word1,String word2,String order){
        int i=0;
        int j=0;
        int lex = 0;
        while(i<word1.length()&&j<word2.length()&&lex==0){
            int n= order.indexOf(word1.charAt(i));
            int m = order.indexOf(word2.charAt(j));
            lex=n-m;
            
                
            i++;
            j++;
        }
        if(lex==0){
            return word1.length()-word2.length();
        }else
            return lex;
        
    }
}