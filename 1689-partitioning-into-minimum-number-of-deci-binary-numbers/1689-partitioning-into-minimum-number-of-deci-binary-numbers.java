class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char c:n.toCharArray()){
            int no=c-'0';
           // System.out.println(no);
            if(no>max)
                max=no;
        }
        return max;
    }
}