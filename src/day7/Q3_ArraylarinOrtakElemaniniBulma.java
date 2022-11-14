package day7;

import java.util.ArrayList;

public class Q3_ArraylarinOrtakElemaniniBulma {

    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */

    public static void main(String[] args) {

        String [] array1= {"John","Brad","Ange","Sofia","Emily"};
        String [] array2= {"sofia","brad","grace","emily","hazel"};

        ortakElemanArrayToList(array1,array2);

    }

    private static void ortakElemanArrayToList(String[] array1, String[] array2) {

        ArrayList<String> arrayList= new ArrayList<>();
        for (String each: array1) {
            for (String hic: array2){
                if(each.equalsIgnoreCase(hic)){

                    arrayList.add(each);
                }
            }

        }
        System.out.println(arrayList);
    }


}
