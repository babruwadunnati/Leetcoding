class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int finallen= (len%k==0) ? len/k : len/k+1;
        String[] str = new String[finallen];
        int fillers = k - len%k ;
        if (fillers==k) fillers=0;
        StringBuilder fillstring = new StringBuilder();
        StringBuilder newstring = new StringBuilder(s);
        for(int i=0;i<fillers;i++){
            fillstring.append(fill);
        }
        newstring.append(fillstring);
        int j=k;
        int i,pointer=0;
        for(i=0;i<newstring.length();i=i+k){
            str[pointer++]=newstring.substring(i,j);
            j+=k;
        }
        return str;
        
    }
}