class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        //Somehow taking longer time
//         HashMap<Character,Integer> hm1=new HashMap<>();
//         for(char c:magazine.toCharArray()){
//             if(hm1.containsKey(c)){
//                 int val=hm1.get(c);
//                 hm1.put(c,val+1);
//             }else
//                 hm1.put(c,1);
                
//         }
//         for(char c:ransomNote.toCharArray()){
//             if(!hm1.containsKey(c)||hm1.get(c)<=0){
//                 return false;
//             }else
//                 hm1.put(c, hm1.get(c)-1);
//         }
//         return true;
        
        if(ransomNote.length()>magazine.length()) return false;
        int[] arr = new int[26];
        for(char c:magazine.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(arr[c-'a']<=0)
                return false;
            else
                arr[c-'a']--;
        }
        return true;
    }
}