

public class Palindrome {
    public static boolean checkpalindrome(String str){
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= str.charAt(str.length()-1-i)) {
                return false;
            }
    }
    return true;
}
    public static void main(String[] args) {
        String str= "noon";
        String str2 =new String("hello");
        boolean result=checkpalindrome(str);
        if (result) {
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        }

    }

