package day01;

public class Q2_Print {
    /*
    76453 sayisinin her bir basamagini konsolda alt alta yazdirin
     input= 76453
     output:7
            6
            4
            5
            3

     */

    public static void main(String[] args) {
        int sayi=98654;

        int birlerBasamak=sayi%10;
        int onlarBasamak=(sayi/10)%10;
        int yuzlerBasamak=(sayi/100)%10;
        int binlerBasamak=(sayi/1000)%10;
        int onbinlerBasamak=(sayi/10000)%10;

        //System.out.println(onbinlerBasamak+"\n"+binlerBasamak+"\n"+yuzlerBasamak+"\n"+onlarBasamak+"\n"+birlerBasamak);
        System.out.println(onbinlerBasamak+" "+binlerBasamak+" "+yuzlerBasamak+" "+onlarBasamak+" "+birlerBasamak);
    }

}
