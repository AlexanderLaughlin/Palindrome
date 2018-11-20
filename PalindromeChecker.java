/**
 * 
 * 
 * Alexander Laughlin
 *11/20/18
 */

public class PalindromeChecker
{
    public static void main (String[] args)
    { //test cases
        System.out.println("\"palindrome\" is a palindrome: " + palindrome("palindrome"));
        System.out.println("\"mom\" is a palindrome: " + palindrome("mom"));
        System.out.println("\"Racecar\" is a palindrome: " + palindrome("Racecar"));
        System.out.println("\"R\" is a palindrome: " + palindrome("R"));
        System.out.println("\"\" is a palindrome: " + palindrome(""));
        System.out.println("\"amanaplanacanalpanama\" is a palindrome: " + palindrome(""));  
        System.out.println("\"mxym\" is a palindrome: " + palindrome("mxym"));        
    }

    public static boolean palindrome(String str){
        str=str.toUpperCase(); //all upper case to compare
        if (str.length() < 2){ //any string of length < 2 is a palindrome
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length()-1)){ //if first and last letters match
            return palindrome(str.substring(1, str.length()-1)); //call palindrome on string minus first and last letters
        }
        else{
            return false;
        }
    }
}

