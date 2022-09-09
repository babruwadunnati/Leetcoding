class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int LG=0;
        int LP=0;
        int LM=0;
        int pickuptime=0;
        int traveltime =0;
        int[] prefix=new int[travel.length];
        prefix[0]=travel[0];
        for(int i=1;i<travel.length;i++){
           // System.out.println(prefix[i]+""+prefix[i-1]+""+travel[i]);
            prefix[i]=prefix[i-1]+travel[i];
        }
        //System.out.println(Arrays.toString(prefix));
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].indexOf('G')!=-1){
                LG=i;
               // System.out.println("Glass is present"+i);
            }
            if(garbage[i].indexOf('P')!=-1){
                LP=i;
                //System.out.println("Paper is present"+i);
            }
            if(garbage[i].indexOf('M')!=-1){
                LM=i;
                //System.out.println("Metal is present"+i);
            }
            pickuptime+=garbage[i].length();
                
        }
        if(LG>0)traveltime+=prefix[LG-1];
        if(LP>0)traveltime+=prefix[LP-1];
        if(LM>0)traveltime+=prefix[LM-1];
        
        
        return pickuptime+traveltime;
        
    }
}