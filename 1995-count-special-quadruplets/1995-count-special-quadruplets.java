class Solution {
    public int countQuadruplets(int[] nums) {
        int count=0;
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    for(int g=k+1;g<nums.length;g++){
                        if(nums[g]==sum){
                            count++; 
                            System.out.println(nums[i]+"+"+nums[j]+"+"+nums[k]+"="+nums[g]);
                        }
                    }
                }
            }
        }
        return count;
    }
}