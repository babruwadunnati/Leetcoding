class Solution {
    public int countValidWords(String sentence) {
        String[] splited = sentence.strip().split("\\s+");
        int count =0 ;
        for(int i=0;i<splited.length;i++){
            count+=checkValid(splited[i]);
        }
        return count;
    }
    int checkValid(String word){
        int hyphen=0;
        int punctuation =0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isDigit(c))
                return 0;
            else if(c=='-'){
                if(hyphen==1||i==0||i==word.length()-1)return 0;
                else if(!(Character.isLowerCase(word.charAt(i-1)) &&Character.isLowerCase(word.charAt(i+1))))
                    return 0;      
                hyphen=1;
            }else if(c==','||c=='.'||c=='!'){
                if(i!=word.length()-1|| punctuation==1)
                    return 0;
                punctuation=1;
            }
        }
        return 1;
    }
}