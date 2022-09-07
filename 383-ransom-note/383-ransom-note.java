class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(char c:magazine.toCharArray()){
            if(hm1.containsKey(c)){
                int val=hm1.get(c);
                hm1.put(c,val+1);
            }else
                hm1.put(c,1);
                
        }
        for(char c:ransomNote.toCharArray()){
            if(!hm1.containsKey(c)||hm1.get(c)<=0){
                return false;
            }else
                hm1.put(c, hm1.get(c)-1);
        }
        return true;
    }
}