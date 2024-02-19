import java.util.Scanner;

public class KdvHesaplama {
    public static void  main(String[] args) {

        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tutar giriniz:");
        tutar = input.nextDouble();

        if (tutar>0 && tutar<1000){
            kdvTutar = tutar * kdvOran1;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV oranı: " + kdvOran1);
            System.out.println("KDV tutarı: " + kdvTutar);
            System.out.println("KDVli tutar: " + kdvliTutar);
        } else {
            kdvTutar = tutar * kdvOran2;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz tutar: " + tutar);
            System.out.println("KDV oranı: " + kdvOran2);
            System.out.println("KDV tutarı: " + kdvTutar);
            System.out.println("KDVli tutar: " + kdvliTutar);
        }
    }
}
