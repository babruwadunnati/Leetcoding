class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stk.push(')');
            }
            else if(c=='{'){
                stk.push('}');
            }
            else if(c=='['){
                stk.push(']');
            }
            else{
                if(stk.empty()||stk.pop()!=c)
                    return false;
//                 else if(stk.peek()==c)
//                     stk.pop();
                
            }
        }
       return stk.empty();
    }
}