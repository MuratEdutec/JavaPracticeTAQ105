package day04_;

import java.util.Arrays;

public class C03_KelimeyiHarflerineAyirma {
    public static void main(String[] args) {
        /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array (do not use toCharArray() method)
        * Input : John
         * Output : [J, o, h, n]
        Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */

       String name="Semra";

       kelimeyiHarflereAyirma(name);
       kelimeyiHarflereAyirma("String" );
       kelimeyiHarflereAyirma("54fa0096" );



    }
    public static void kelimeyiHarflereAyirma(String input){

        char[] output= new char[input.length()];

        for (int i = 0; i < input.length() ; i++) {
            output[i]= input.charAt(i);

        }
        System.out.println("Kelimenin hargleri"+ Arrays.toString(output));
    }


}

