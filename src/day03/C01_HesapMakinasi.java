package day03;

import java.util.Scanner;

public class C01_HesapMakinasi {
    /*
    kullacidan alacagimiz iki sayiyi yine kullaniciya sectireceginiz
    dort islemden biri ile isleme koyup sonucunu yazdiriniz
    */


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz : ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("Yapmak istediginiz islemi secinizn\n\t" +
                            "1. Toplama\t2. Cikarma\n\t3. Carpma\t4.Bolme");

        int islem=scan.nextInt();

        if (islem==1) System.out.println("Toplama Isleminizin sonucu--> "+ (sayi1+sayi2));
        else if (islem==2) System.out.println("Cikarma Isleminizin sonucu--> "+(sayi1-sayi2));
        else if(islem==3) System.out.println("Carpma Isleminizin sonucu--> "+(sayi1*sayi2));
        else if(islem==4) System.out.println("Bolme Isleminizin sonucu --> "+(sayi1/sayi2));
        else System.out.println("Gecersiz giris yaptiniz");


    //***********************2/cozu

























    }

}
