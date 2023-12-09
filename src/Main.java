import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 10, b = 2, UcgenTaban = 15, ucgenYukseklik = 12, isaret = -3,
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



    }
}