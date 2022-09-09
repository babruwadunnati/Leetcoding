class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map= new HashMap<>();
        String[] splited = s.split("\\s+");
        // for(int i=0;i<pattern.length();i++){
        //     System.out.println(";"+splited[i]+";");
        // }
        if(splited.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
          //  System.out.println(map);
            if(map.containsKey(c)){
              //  System.out.println(map);
                String temp = map.get(c);
              // System.out.println(temp.getClass().getName() +""+splited[i].getClass().getName());
                if(!(temp.toString().equals(splited[i].toString()))){
                   // System.out.println(temp+ ";"+ splited[i]+";"+i);
                    return false;
                }
                    
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