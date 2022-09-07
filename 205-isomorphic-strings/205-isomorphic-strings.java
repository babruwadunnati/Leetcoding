class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Boolean> hm2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char skey = s.charAt(i);
            char tkey = t.charAt(i);

            
            if(hm1.containsKey(skey)){
                if(hm1.get(skey)!=tkey)
                    return false;
            }else{
                if(hm2.containsKey(tkey))
                    return false;
                else{
                    hm1.put(skey,tkey);
                    hm2.put(tkey,true);
                }
            }
        }
        return true;
        
    }
}