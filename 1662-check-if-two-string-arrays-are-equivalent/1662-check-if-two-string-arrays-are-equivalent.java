class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for(String str:word1){
            first.append(str);
        }
        for(String str:word2){
            second.append(str);
        }
        System.out.println(first+" "+second);
        return (first.toString().equals(second.toString()));
    }
}