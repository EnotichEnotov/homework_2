
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = (new Scanner(System.in)).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        if ((n < 5 || n > 20) && (n % 10 < 5 || n % 10 == 9) && n % 10 != 0) {
            if (n % 10 == 1) {
                System.out.println("" + n + " TORT");
            } else {
                System.out.println("" + n + " TORTA");
            }
        } else {
            System.out.println("" + n + " TORTOV");
        }

    }
}
