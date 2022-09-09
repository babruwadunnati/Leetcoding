class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map= new HashMap<>();
        String[] splited = s.split("\\s+");
        if(splited.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                String temp = map.get(c);
                if(!(temp.toString().equals(splited[i].toString())))
                    return false;   
            }else{
                if(map.containsValue(splited[i]))
                    return false;
                else
                map.put(c,splited[i]);
            }
                
        }
        return true;
        
    }
}