
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
       int mn= 9;
       while (n > 0){
           if (n % 10 < mn && n % 10 != 0){
               mn = n % 10;
           }
           n = n / 10;
        }
        System.out.println(mn);
        }

    }

