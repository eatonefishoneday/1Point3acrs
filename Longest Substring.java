public class LongestSubstring {
	 public int lengthOfLongestSubstring(String s) {
	        String onechar = "";
	        String sub = "";
	        String longestSub = "";
	        if(s.length() <= 1){
	            return s.length();
	        }
	        for(int i = 1; i <= s.length(); i++){
	            onechar = s.substring(i-1 , i);
	            sub += onechar; 
	            if(sub.length() == s.length()){
	                longestSub = sub;
	                return longestSub.length();
	            }
	            if(i < s.length()){
	                onechar = s.substring(i, i+1);
	                for(int j = 1; j <= sub.length(); j++){
	                    if(onechar.equals(sub.substring(j-1, j))){              
	                        if(longestSub.length() < sub.length()){
	                            longestSub = sub;
	                            System.out.println("longestSub is " + longestSub );
	                        }
	                        sub = "";
	                       
	                        
	                    }
	                }
	            }
	            if(i == s.length() && longestSub.length() < sub.length()){
	                longestSub = sub;
	                return longestSub.length();	            	
	            }

	         }

	       return longestSub.length(); 
	     }

    public static void main(String[] args) {
         LongestSubstring test = new LongestSubstring();
            System.out.println(test.lengthOfLongestSubstring("dvdf"));
        }

}
