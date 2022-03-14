package asal;
import java.util.Scanner;

public class AsalRecusive {

    static boolean AsalSayiMi(int n, int i ){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return AsalSayiMi(n, i + 1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.printf("Bir sayı giriniz : ");
        sayi=input.nextInt();
        if (AsalSayiMi(sayi, 2))
            System.out.println(sayi + " Asal sayıdır");
        else
            System.out.println(sayi + " Asal sayi değildir");

        input.close();
    }
}