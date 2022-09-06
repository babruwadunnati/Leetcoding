class Solution {
    public boolean checkRecord(String s) {
        // int absent=0;
        // int late=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='A')
//                 absent++;
//             else if(s.charAt(i)=='L'){
//                 if((i+2)<=s.length()-1 && s.charAt(i+1)=='L' && s.charAt(i+2)=='L')
//                     late++;     
//             }
                
//             else 
//                 continue;
//         }
//         System.out.println(absent +" "+ late);
//         if(absent<2 && late==0)
//             return true;
//         else 
//             return false;
        
        int absent=0;
        int concount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                absent++;
                concount=0;
            }
            else if(s.charAt(i)=='L')
                concount++;
            else
                concount=0;
            if(absent>1 || concount>2)
                return false;
        
        }
        return true;
        
    }
}