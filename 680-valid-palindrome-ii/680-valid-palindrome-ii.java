class Solution {
    public boolean validPalindrome(String s) {
        // HashMap<Character,Integer> freq = new HashMap<>();
        // for(char c: s.toCharArray()){
        //     if(freq.containsKey(c)){
        //         int count = freq.get(c);
        //         freq.put(c,count+1);
        //     }else{
        //         freq.put(c,1);
        //     }
        // }
        // // System.out.println("Mappings of HashMap hm1 are : "
        // //                    + freq);
        // int count=0;
        // int len = s.length();
        // for (int value: freq.values()){
        //     if(value%2!=0){
        //         count++;
        //     }
        // }
        // if(len%2==0 && count!=0) return false;
        // else if(len%2!=0 && count>2) return false;
        // else return true;
        
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                //call helper function
                return checkPalindrome(s,start+1,end)||checkPalindrome(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
        
    }
    boolean checkPalindrome(String s, int start, int end){
        int first = start;
        int last = end;
        while(first<last){
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
        
    }
    
}