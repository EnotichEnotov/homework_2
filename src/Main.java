
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int prev = 1;
        int cur = 1;
        int c = 1;
        if (n<=2){
            System.out.println(1);
        }
        else{
            for (int i = 3;i < n+1; ++i){
                c = cur;
                cur += prev;
                prev = c;
            }
            System.out.println(cur);
        }

    }
}
