package day5;

import java.util.Scanner;

public class Q3_SayilariTersyazdirma {
    /*
     * Interview questions…
     *
     * write a return method to reverse number
     *
     * Input : 12345 Output : 54321
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int input= scan.nextInt();

        System.out.println("Girilen sayinin ters cevrilmis hali :" + reverseTersYazdirNumber(input));

    }

    public static int reverseTersYazdirNumber(int input) {

    int reverseNum = 0;
    while (input>0 ){

        reverseNum = input%10 + reverseNum*10;
        input= input/10;

    }
    return reverseNum;

    }



}
