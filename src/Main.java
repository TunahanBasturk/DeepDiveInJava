import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

 /*       int a = 10, b = 2, UcgenTaban = 15, ucgenYukseklik = 12, isaret = -3,
                faizOrani = 25, sure = 300, not = 75, taban = 3, us = 3;
        long sonucUs =1;
        double anaPara = 35500.0;
        String kullaniciAdi = "Tunahan", sifre  = "asd123" ;

//                  Hesap Makinesi

        System.out.println("Toplam = " + (a + b));
        System.out.println("Fark = " + (a - b));
        System.out.println("Çarpım = " + (a * b));
        System.out.println("Bölüm = " + (a / b));
      //  System.out.println("üçgenin Alanı = " + ((taban * yukseklik) / 2));

//                    Çift mi Tek mi ?

        if (a%2 == 0){
          System.out.println("Sayı Çift");
        }
        else {
            System.out.println("Sayı Tek");
        }

       //               Fazi Hesaplama

        double faizGetirisi = (anaPara/100)*((float) faizOrani /365)*sure ;
        System.out.println("Faiz Getirisi: " + faizGetirisi);

        //              Not Hesaplayıcı
        
        if (not >= 85) {
            System.out.println("AA");
        }
        else if (not < 85 && not >= 70) {
            System.out.println("BB");
        } else if (not < 70 && not >= 55) {
            System.out.println("CC");
        } else if (not < 55) {
            System.out.println("FF");
        }

        // Üs Alma
        for(int i =1; i<= us; i++){
            sonucUs = taban * sonucUs;

        }
        System.out.println("Üs Sonucu: " + sonucUs);

//          En büyük sayıyı bulma

        if (a>b && a>us){

            System.out.println("En Büyük Sayı a");  // Eşit olma olasılığı hesaba katılmamıştır.
        } else if (b>a && b>us) {
            System.out.println("En Büyük Sayı b");
        } else if (us>a && us>b) {
            System.out.println("En Büyük Sayi us");
        }

*/
        //  ------------------          İKİNCİ ÖDEV        ------------------
//         Birinci soru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi Giriniz: ");
        String cumle = scanner.nextLine();
        int boslukSayisi = 0;
        for (int i=0;i<cumle.length();i++){
            if(cumle.charAt(i) ==' ' ){
                boslukSayisi++;
            }

        }

        System.out.println("Cümledeki boşluk sayısı: "+ boslukSayisi);

        //İkinci Soru

        System.out.print("Kelime giriniz: ");
        int c = 0;
        String kelime = scanner.nextLine();
        for (int j = 1; j <= kelime.length(); j++) {
            if (!(kelime.charAt(c) == kelime.charAt(kelime.length() - j))) {
                System.out.println("Girilen Kelime Palindrom Değildir");
                break;
            } else {
                if(j==kelime.length()){
                    System.out.println("Girilen Kelime Palindromdur.");
                }
            }
            c++;
        }
/// Üçüncü Soru ---------OLMADI

     /*   String tekrarEdenKelime = "Java";

        for(int k=0; k<=cumle.length(); k++ ){
            for (int l=0; l<=tekrarEdenKelime.length(); l++){
            if (cumle.charAt(k)==tekrarEdenKelime.charAt(l)) {

            }

            }
        }*/

        //  10. Soru
        int sesliHarf = 0;
        int sessizHarf = 0;
        for (int k=0; k<kelime.length();k++) {
            if (kelime.charAt(k)=='a' || kelime.charAt(k)=='e' || kelime.charAt(k)=='ı' || kelime.charAt(k)=='i'
                    || kelime.charAt(k)=='o' || kelime.charAt(k)=='ö' || kelime.charAt(k)=='e'
                    || kelime.charAt(k)=='u' || kelime.charAt(k)=='ü'){
                sesliHarf++;

            }
            else {
                sessizHarf++;
            }
        }
        System.out.println("Sesli Harf Sayısı: " + sesliHarf );
        System.out.println("Sessiz Harf Sayısı: " + sessizHarf );

        //   4. Soru

        for (int z=1; z<= cumle.length();z++){
            System.out.print(cumle.charAt(cumle.length()-z));
        }

        //          7. Soru

        for (int x=0; x<cumle.length();x++){
            if(cumle.charAt(x)==' '){
              //  System.out.print(cumle.toUpperCase(x+1));
                System.out.print(cumle.charAt(x+1));
            }
            else {
                System.out.print(cumle.charAt(x));
            }
        }

    }
}