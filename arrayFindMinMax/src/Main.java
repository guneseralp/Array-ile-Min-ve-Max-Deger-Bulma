import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] list = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(list);
        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.print("Sayıyı giriniz: ");
        int n = sc.nextInt();

        int distance = 0;   // girilen sayıdan küçük en büyük sayı ile arasındaki mesafe
        int distance2 = 0;  // girilen sayıdan bütük en küçük sayı ile arasındaki mesafe
        for(int i : list){
            if(i < n){
                distance = n - i;
            }
            if(i > n){
                distance2 = i - n;
                break;
            }
        }

        System.out.println("Girilen Sayıdan Küçük En Büyük Sayı: " + (n -distance));
        System.out.println("Girilen Sayıdan Büyük En Küçük Sayı: " + (distance2 + n));
    }
}