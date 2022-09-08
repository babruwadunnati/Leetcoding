class Solution {
    public int countPoints(String rings) {
        int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];
        for(int i=1;i<rings.length();i=i+2){
            if(rings.charAt(i-1)=='R')
                r[rings.charAt(i)-'0']++;
            else if(rings.charAt(i-1)=='G')
                g[rings.charAt(i)-'0']++;
            else{
                b[rings.charAt(i)-'0']++;
            }
        }
        int count=0;
        for(int i=0;i<10;i++){
            if(r[i]>0 &&g[i]>0 &&b[i]>0)
                count++;
        }
        return count;
    }
}