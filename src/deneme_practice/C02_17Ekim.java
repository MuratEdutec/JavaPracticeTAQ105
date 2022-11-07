package deneme_practice;

import java.util.Scanner;

public class C02_17Ekim {
       /*
    kullacidan alacagimiz iki sayiyi yine kullaniciya sectireceginiz
    dort islemden biri ile isleme koyup sonucunu yazdiriniz
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz : ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Yapmak istediginiz islemi secinizn\n\t" +
                "Toplama icin +\t Cikarma icin -\n\tCarpma icin *\tBolme icin /");

        char islem = scan.next().charAt(0);
        System.out.println(calculator(islem, sayi1, sayi2));
    }
/*
    public static String kullanicidanIslemAl(){
        String input= scan.next(); //Plus
        return input.substring(0,1).trim().toLowerCase();

    }
*/

    public static double calculator(char islemTipi, double num1, double num2) {
        double sonuc = 0;

        switch (islemTipi) {
            case '+':
                sonuc = num1 + num2;
                break;
            case '-':
                sonuc = num1 - num2;
                break;
            case '*':
                sonuc= carpma (num1,num2);
                break;
            case '/':
                sonuc = bolme(num1, num2);
                break;
        }

        return sonuc;

    }

    public static double carpma(double num1, double num2) {

        return num1*num2;
    }

    public static double bolme(double bolunen, double bolen) {
        if (bolen == 0 && !(bolunen == 0))
            return Double.POSITIVE_INFINITY;
        else if (bolen == 0 && bolunen == 0)
            return Double.NaN;
        else return bolunen / bolen;
    }

}
