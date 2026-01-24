import java.util.*;
public class checkanagram {

///     t-> O(nlogn)   s->O(n);
public static boolean check1(String str1,String str2){
    if (str1.length()!=str2.length()) return false;

       char []arr=str1.toCharArray();
       char []arr2=str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr, arr2);
}


///     t-> O(n)   s->O(n);
public static boolean check2(String str1,String str2){
     if (str1.length()!=str2.length()) return false;
      
     HashMap<Character,Integer>m1=new HashMap<>();
     HashMap<Character,Integer>m2=new HashMap<>();

     for (int i = 0; i < str1.length(); i++) {
        m1.put(str1.charAt(i),m1.getOrDefault(str1.charAt(i),0)+1);
        m2.put(str2.charAt(i),m2.getOrDefault(str2.charAt(i),0)+1);

        
     }
return m1.equals(m2);
}


///     t-> O(n)   s->O(1);
public static boolean check3(String str1,String str2){
     if (str1.length()!=str2.length()) return false;
         int []count=new int[26];
     for (int i = 0; i < str1.length(); i++) {
        count[str1.charAt(i)-'a']++;
        count[str2.charAt(i)-'a']--;
     }
     for (int i = 0; i < 26; i++) {
        if (count[i]!=0) {
            return false;
        }
     }
     return true;
}


   public static void main(String[] args) {
     String str1="race";
     String str2="care";
    System.out.println(check1(str1, str2));

    System.out.println(check2(str1, str2));

    System.out.println(check3(str1, str2));



   } 
}
