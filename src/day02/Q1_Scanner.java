package day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1_Scanner {
    public static void main(String[] args) {

        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde kaca bardak cay iciyorsunuz");
        double bardak= scan.nextDouble();
        System.out.println("Her bardak icin kac kup seker atiyorsunuz");
        double seker=scan.nextDouble();
        double yillikTuketimKg= (bardak*seker*2.77)*365/1000;
        double kirkYillikTuketimKg=yillikTuketimKg*40;
        double bardakYillik= bardak*365;
        double bardakKirkYillik= bardakYillik*40;


        if(seker==0){
            System.out.println();
            System.out.println("Good Job, less sugar more health\n");

        }else if(seker > 0){
            System.out.println("Bir yilda "+ yillikTuketimKg+" kg seker\n40 yilda da "+ kirkYillikTuketimKg  +" kg seker tuketiyorsunuz");
        }else
        {
            System.out.println("Gecersiz giris yaptiniz");
        }




    }

}
