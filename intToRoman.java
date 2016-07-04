public class Solution {
    public static void main(String[] argv) {
    	System.out.println(intToRoman(11));
    	System.out.println(intToRoman(399));
    	System.out.println(intToRoman(39));
    	System.out.println(intToRoman(3));
    	System.out.println(intToRoman(-1));
    	System.out.println(intToRoman(9999));
    }
    public static String intToRoman(int num) {
    	String romannumeral = "";
        if(num < 1 || num > 3999){
            System.out.println("invalid input");
            return romannumeral;
        }  
        String[][] roman = {
        		{"","I","II","III","IV","V","VI","VII","VIII","IX"},
        		{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        		{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        		{"","M","MM","MMM"}
        };
        String parameter = Integer.toString(num);     
        int j = 0;
        for(int i = parameter.length() ; i > 0 ; i--){
        	char c = parameter.charAt(i-1);
        	int h = Character.getNumericValue(c);
        	romannumeral =  roman[j][h] + romannumeral;
        	j++;
        }
        return romannumeral;
    }     
 

  

}
 
