class Solution {
    public int largestAltitude(int[] gain) {
        int highest =0;
        int initial=0;
        for(int i:gain){
            initial = initial+i;
            if(initial>highest)
                highest=initial;
        }
        return highest;
    }
}