package day04_;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_CumledeKelimeAratma {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir Cumle giriniz : ");
        String cumle = scan.nextLine();

        System.out.println("Cumlede girmek istediginiz kelimeyi giriniz : ");
        String kelime = scan.nextLine();

        int sayac = 0;

        for (int i = 0; i <= cumle.length() - kelime.length(); i++) {
            if (cumle.substring(i, i + kelime.length()).equalsIgnoreCase(kelime)) {

                sayac++;
            }

        }
        System.out.println(sayac);
        if (sayac > 1) System.out.println("Cumlenin icerisinde " + sayac + " kadar " + kelime + " var.");
        else if(sayac==1) System.out.println("Cumlenin icerisinde 1 adet " + kelime + " var.");
        else System.out.println("Aradiginiz kelime cumlede bulunmamaktadir");
    }

}
