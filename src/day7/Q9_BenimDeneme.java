package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_BenimDeneme {
    static int bosKova;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] num;
        int sum = 0;
        int size;

        System.out.println("-->> Max Min Ogrenmek Isteginiz Sayi Adedini Giriniz?! ");
        size = scan.nextInt();
        num = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Lutfen sayi giriniz =-> ");
            num[i] = scan.nextInt();

        }
       System.out.print("-Girdiginiz sayilar "+Arrays.toString(num)+" "+"\n");

        for (int element: num) {
            System.out.print(element+" ");

        }

        maxNumberArray(num);
        minNumberArray(num);

}


        private static void minNumberArray(int [] array) {
            bosKova = array[0];
            for (int each : array) {
                if (each < bosKova) {
                    bosKova = each;
                }
            }
            System.out.println("Array'in en kucuk elemani = " + bosKova);
        }

        private static void maxNumberArray(int [] array) {
            bosKova = array[0];
            for (int  each : array)
                if (each > bosKova) {
                    bosKova = each;
                }
            System.out.println("\nArray'in en buyuk elemani = " + bosKova);
        }

        }
