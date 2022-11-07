package day04_;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Scanner;

public class C04_DikUcgen {
    public static void main(String[] args) {

        /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2           ikinci kenari giriniz 15         üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.              Bu bir dik ucgendir.
     */

        int [] kenarlar= new int[3];
        ///int kenarSayac=1;  ta kullanilabilir yada i ye alabiliriz

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + ". kenar uzunlugunu giriniz : ");
            kenarlar[i] = scan.nextInt();

        }
        if (Math.pow(kenarlar[0], 2) + Math.pow(kenarlar[1], 2) == Math.pow(kenarlar[2],2) ||
             Math.pow(kenarlar[1], 2) + Math.pow(kenarlar[2], 2) == Math.pow(kenarlar[0],2) ||
             Math.pow(kenarlar[2], 2) + Math.pow(kenarlar[0], 2) == Math.pow(kenarlar[1],2))


             System.out.println("bu bir dik ucgendir");
        else System.out.println("DIK ucgen degildir");


    }

    public static int findLongestEdge (int [] kenarlar){


        int max= kenarlar[0];
        if(kenarlar[1]> max) max= kenarlar[1];
        if(kenarlar[2]> max) max= kenarlar[2];
        return max;

    }

}
