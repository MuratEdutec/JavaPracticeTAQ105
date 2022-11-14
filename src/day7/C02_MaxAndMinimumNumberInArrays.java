package day7;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MaxAndMinimumNumberInArrays {

    // Verilen bir Array'in icerisindeki en buyuk ve en kucuk sayilari
    // bulan methodlari yaziniz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double [] num;
        double sum=0;
        int size;

        System.out.println("Kac adet sayiyi siralamak istiyorsunuz?! ");
        size= scan.nextInt();

        num= new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Lutfen sayi girmeye devam ediniz =-> ");
            num[i]=scan.nextDouble();

        }
        System.out.print(Arrays.toString(num));

    }
    }


