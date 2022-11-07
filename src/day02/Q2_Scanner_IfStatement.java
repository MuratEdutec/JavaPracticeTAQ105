package day02;

import java.util.Scanner;

public class Q2_Scanner_IfStatement {
    public static void main(String[] args) {

/*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

       /* Scanner scan= new Scanner(System.in);
        System.out.print("'Vize' notunuzu giriniz : ");
        double vizeNotu= scan.nextDouble();
        System.out.print("'Final' notunuzu giriniz : ");
        double finalNotu=scan.nextDouble();
        System.out.print("Devam puaninizi giriniz : ");
        double devamPuani= scan.nextDouble();
        double ortalama=(vizeNotu*0.10)+(finalNotu*0.80)+(devamPuani*0.10);
        System.out.println(ortalama);

*/
      /*  Scanner scan=new Scanner(System.in);
        double vize, finalNotu, devam;

        System.out.print("Vize notunuzu giriniz : ");
        vize= scan.nextDouble();

        System.out.print("Final notunuzu giriniz : ");
        finalNotu= scan.nextDouble();

        System.out.print("Devam notunuzu giriniz : ");
        devam= scan.nextDouble();
*/
        Scanner scan = new Scanner(System.in);
        double vize, finalNotu, devam;

        System.out.println("Vize notunuzu giriniz : ");
        vize = scan.nextDouble();
        System.out.println("Final notunuzu giriniz : ");
        finalNotu = scan.nextDouble();
        System.out.println("Devam notunuzu giriniz : ");
        devam = scan.nextDouble();

        double ortalama = vize * 0.10 + finalNotu * 0.80 + devam * 0 * 10;
        System.out.println(ortalama);


        if( ortalama>100 || ortalama<0) System.out.println("Gecersi giris yaptiniz");

        else if (ortalama > 60)System.out.println("Gecer"); //ayni satirda olursa { } (suslu parantezlere ihtiyac yok

        else if (ortalama >= 60) System.out.println("Sartli gecis");

        else if (ortalama < 60) System.out.println("kaldiniz");


    }
}