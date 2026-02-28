/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * 
 * This usew case extends UC5 by implmenting a modular approach to generate each
 * letter's pattern through dedicated methods. THis enhances code reusability and
 * maintainability by separating pattern generation from the main display.
 * 
 * @author Developer
 * @version 6.0
 */

public class OOPSBannerApp{
    public static String[] getOpattern(){
            return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   ",

            };
    }
    public static String[] getPpattern(){
            return new String[]{
                          "******   ",  
                          "**    ** ",  
                          "**     **",  
                          "**    ** ",  
                          "******   ",  
                          "**       ",  
                          "**       ",  
                          "**       ",  
                          "**       ",  

            };
    }
    public static String[] getSpattern(){
            return new String[]{
                "   ***** ",
                " **      ",                  
                "**       ",  
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   ",

            };
    }
    public static void main(String[] args){
        String[] oPattern = getOpattern();
		String[] pPattern = getPpattern();
        String[] sPattern = getSpattern();
        for(int i = 0; i < oPattern.length; i++){
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }

        
    }
}