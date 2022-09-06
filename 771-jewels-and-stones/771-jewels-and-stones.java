class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        //Brute Force
        // int jewelcount=0;
        // for(char c:jewels.toCharArray()){
        //     for(char ch: stones.toCharArray()){
        //         if(c==ch)
        //             jewelcount++;
        //     }
        // }
        // return jewelcount;
        
        //Optimised
        HashSet<Character> set = new HashSet<>();
        for (char character : jewels.toCharArray()) {
            set.add(character);
        }
        int count = 0;
        for (char character :stones.toCharArray()) {
            if(set.contains(character)) count++;
        }
        return count;
        
    }
}