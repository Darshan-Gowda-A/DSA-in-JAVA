import java.util.*;


public class palindromcheck { 
public static boolean isplaindrome(int num){
     int newdigit=0;
     int n=num;
    while(num!=0){
       int digit=num%10;
       num=num/10;
      
       newdigit=10*newdigit+digit;
    }
    System.out.println(n);
    System.out.println(newdigit);
    if (n==newdigit) {
        return true;
    }
    else{
        return false;
    }
}
public static void main(String[] args) {
   boolean result= isplaindrome(12221);
   System.out.println(result);
}
    
}
