class Solution {
    public String defangIPaddr(String address) {
        StringBuilder newaddr = new StringBuilder();
        for(char c: address.toCharArray()){
            if(c=='.')
                newaddr.append("[.]");
            else
                newaddr.append(c);
        }   
        return newaddr.toString();
    }
}