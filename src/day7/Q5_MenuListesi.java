package day7;

public class Q5_MenuListesi {

    // Food List
    // american
    //----
    // italian
    //----
    // asian
    //----
    // afgani
    //----
    //indian
    //----
    public static void main(String[] args) {


    String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
            {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
            {"beriyani", "masal", "curry", "chicken tikka masala"}};


        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {
                System.out.print(food[i][j]+ ",");
            }
            System.out.println("--|");
        }


        for (String [] ulkeler :food) {
            for (String yemek: ulkeler ) {
                System.out.println(yemek);
            }
            System.out.println("-----");
        }
        System.out.println("---------------| FOR I COZUM |---------------");
        String[] country={"american","american","italian","asian","afgani","indian",};
        for (int i = 0; i <food.length ; i++) {

            System.out.println("--> "+ country[i]+ " <--");
            for (int j = 0; j <food[i].length ; j++) {
                System.out.println(food[i][j]+",");
            }

        }







      /*



*/


    }

}
