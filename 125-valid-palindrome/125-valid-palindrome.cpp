class Solution {
public:
bool isPalindrome(string s) {
    int n=s.length();
    for(int i=0; i<n;i++)
    {
        if(s[i]>=65&&s[i]<=90)
        {
            s[i]=s[i]+32;
        }
     }
    int i=0;
    while(i < n) {
        if (!isalnum(s[i]) || s[i] == ' '){
            s.erase(i,1);
            n--;
        }else
            i++;
    }


    int flag=0;

    for(int j=0;j<n;j++)
    {
        if(s[j] !=s[n-1-j]){
            flag=1;
            break;
        }
    }

    if(flag==1)
        return false;
    else

      return true;  


    }
};