package day06;

import java.util.Arrays;

public class Q2_Arrays {
    public static void main(String[] args) {

        int [] integers;
        integers= new int[5];

        System.out.println(Arrays.toString(integers));
        integers[0]=1;
        System.out.println(Arrays.toString(integers));
        integers[1]=2;
        System.out.println(Arrays.toString(integers));
        integers[2]=3;
        System.out.println(Arrays.toString(integers));
        integers[3]=4;
        System.out.println(Arrays.toString(integers));
        integers[4]=5;
        System.out.println(Arrays.toString(integers));


        char [] charlar= new char[3];
        charlar[0]='A';
        charlar[1]='B';
        charlar[2]='C';

        System.out.println(charlar);
        String charlarString= Arrays.toString(charlar);
        System.out.println(charlarString);

        String [] isimler= new String[3];
        isimler[0]="Ayse";
        isimler[1]="Fatma";
        isimler[2]="Huriye";
        String isimlerString1= Arrays.toString(isimler);
        System.out.println(isimlerString1);

        String dene=isimler[0];
        isimler [0]=isimler[1];
        isimler[1]=dene;
        String isimlerString= Arrays.toString(isimler);

        System.out.println(isimlerString);







    }
}
