class Solution {
    
    boolean isVowel(char c){
        if( c== 'a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
            return true;
        else 
            return false;
    }
    public String toGoatLatin(String sentence) {
        StringBuilder ans= new StringBuilder();
        boolean wordended=false;
        int wordcount=1;
        boolean charend=false;
        char addend='@';
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' '|| i==sentence.length()-1){
                if(i==sentence.length()-1)
                    ans.append(sentence.charAt(i));
                System.out.println(charend);
                if(charend){
                    ans.append(addend);
                    charend=false;
                }
                ans.append("ma");
                for(int j=0;j<wordcount;j++){
                    ans.append('a');
                }
                  if(i!=sentence.length()-1) ans.append(' ');
                wordcount++;
                wordended=true;
            }
            // else if(isVowel(sentence.charAt(i))){
            //     ans.append(sentence.charAt(i));
            else{
                if(((wordended)&&!isVowel(sentence.charAt(i)) )||( i==0 && !isVowel(sentence.charAt(i)))){
                    charend = true;
                    addend = sentence.charAt(i);
                    
                }else
                    ans.append(sentence.charAt(i));
                
                wordended=false;
            }
                
            
        }
        System.out.println(ans.toString());
        return ans.toString();
        
        
    }
}