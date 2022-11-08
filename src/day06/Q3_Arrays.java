package day06;

import java.util.Arrays;

public class Q3_Arrays {
    // Create an array of 5 floats and calculate thier sum
    public static void main(String[] args) {


        float[] sayilar = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};

        float toplam = 0;


        System.out.println("-----> FOR COZUMU <-----");


        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i];

        }

        System.out.println(toplam);

        System.out.println("-----> WHILE COZUMU <-----");
        toplam=0;
        int index=sayilar.length-1;
        while (index>=0) {
            toplam+=sayilar[index];
            index --;
        }
        System.out.println(toplam);




        System.out.println("-----> WHILE COZUMU 2 <-----");
        /*
        toplam=0;
        index = 0;
        while(index< sayilar.length){
            toplam+=sayilar[index];
            index++;
        }

         */



        toplam=0;
        index=0;
        while (index<sayilar.length) {
            toplam+=sayilar[index];
            index ++;
        }
        System.out.println(toplam);



        System.out.println("-----> DO WHILE COZUMU <-----");
        toplam=0;
        index=0;

        do{
            toplam+= sayilar[index];
            index++;

       // }while(index<sayilar.length);  // veya (index>sayilar.length-1);
        }while (index>sayilar.length-1);


        System.out.println(toplam);


    }

}
