package day7;

import java.util.Scanner;

public class C01_SayilarinToplamiArray {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar sayi alip, bu sayilari bir Array'de toplayip
        // bu sayilarin toplamini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        double [] num;
        double sum=0;
        int size;

        System.out.println("Kac adet sayi toplamak istiyorsunuz?! ");
        size= scan.nextInt();

        num= new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Lutfen sayi girmeye devam ediniz =-> ");
            num[i]=scan.nextDouble();
            sum+=num[i];
        }
        System.out.print(sum);

    }
        }
