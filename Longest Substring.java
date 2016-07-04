public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String onechar = "";
        String sub = "";
        String longestSub = "";
        if(s.length() <= 1){
            return s.length();
        }
        for(int i = 1; i < s.length(); i++){
            onechar = s.substring(i-1 , i);
            sub += onechar; 
            if(i < s.length()){
            onechar = s.substring(i, i+1);
            for(int j = 1; j <= sub.length(); j++){
                if(onechar.equals(sub.substring(j-1, j))){              
                    if(longestSub.length() < sub.length()){
                        longestSub = sub;
                    }
                    sub = "";
                   
                    
                }
            }
            }
            else{
                return longestSub.length();
            }
         }

       return longestSub.length(); 
     }
}
