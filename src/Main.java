
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int volk = 2;
        int krol = 11;
        int eaten = 0;
        for (int i = 1;i < n+1; ++i){
                if (i%2==0){
                    krol = krol - 10*volk;
                    eaten += 10*volk;
                }
                else{
                    krol *= 3;
                }
                if (eaten >= 70){
                    volk += eaten / 70;
                    eaten = eaten % 70;
                }
        }
        System.out.println("Волков: " + volk  + " Крошев " + krol);
        }

    }

