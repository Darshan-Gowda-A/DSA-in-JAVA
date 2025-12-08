import java.util.Scanner;

public class alphabertvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String d="";
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int g = (int) (c - n);
            if (g < 65) {

                d=d+(c-(n%26)+26);
                // f.append(c - n + 26);
            } else {
                char b = (char) (c - n);
                d=d+b;
                // f.append(b);
                // System.out.print(b);
            }
        }
        System.out.print(d);

    }
}
