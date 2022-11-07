package day03;

import java.util.Scanner;

public class C03_DogumGunuKiyaslama {
    /*
    kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir prgram yapiniz
    2010/05/23
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karsilastirmak istediginiz 1. dogum gunun YIL/AY/GUN olarak giriniz ");//1.--> sahis
        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();
        System.out.println("Lutfen karsilastirmak istediginiz 2. dogum gunun YIL/AY/GUN olarak giriniz ");//2.--> sahis
        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();
/*
        if (yil1 > yil2)  System.out.println("2. girdiginiz sahis  diger sahistan buyuktur");
         else if (yil2 > yil1) System.out.println("1. girdiginiz sahis  diger sahistan buyuktur");
         else  // bu satira geldigimizde yillar esittir, aylara bakmak icin yeni if blogu olusturulur
            if (ay1 > ay2) System.out.println("2. girdiginiz sahis  diger sahistan buyuktur");
            else if (ay2 > ay1)
                System.out.println("1. girdiginiz sahis  diger sahistan buyuktur");
            else  // bu satira geldigimizde yillar esittir, aylara bakmak icin yeni if blogu olusturulur


            if (gun1 > gun2)  System.out.println("2. girdiginiz sahis  diger sahistan buyuktur");
            else if (gun2 > gun1) System.out.println("1. girdiginiz sahis  diger sahistan buyuktur");
            else System.out.println("Ayni gun dogdunuz");


*/

            //--- daha hizli ve basit YOLLL!!!!
            int birinciSahisDogumGunu=yil1*10000+ay1*100+gun1;
            int ikincisahisDogumGunu=yil2*10000+ay2*100+gun2;
            if(birinciSahisDogumGunu> ikincisahisDogumGunu) System.out.println("Ikinci sahis birinci sahistan yas olarak buyuktur");
            else if (ikincisahisDogumGunu>birinciSahisDogumGunu) System.out.println("Birinci sahis ikinci sahistan yas olarak buyuktur");
            else System.out.println("Ayni gun dogdunuz");






    }

        }
