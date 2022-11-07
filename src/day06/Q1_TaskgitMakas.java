package day06;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Q1_TaskgitMakas {


    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        Random random= new Random();
        random.nextInt();

        int userChoice= 0;
        int computerChoice=0;
        int user=0;
        int comp=0;
        System.out.println("               @.... Let's Play 'Stone Paper Scissors' .....@ ");
        do {

            System.out.println("Please make your choice-->> \t1- for Rock\t\t2- for Paper\t3- for Scissors" +
                    "\n-------------------------------------------------------------------------------");

        userChoice= scan.nextInt();
        computerChoice=random.nextInt(3)+1;

        if (userChoice==1 && computerChoice==2) {                       //1
            System.out.println("Paper beats rock ==> Computer +1  "+" Computer's Choice ->>"+computerChoice);
            comp++;
            System.out.println("User = "+ user + "| Computer = "+comp+"\n============================" );

        } else if (userChoice == 1 && computerChoice == 3) {                //2
            System.out.println("Rock beats scissors ==> Computer +1  "+" Computer's Choice ->>"+computerChoice);
            comp++;
            System.out.println("User = "+ user + "| Computer = "+comp +"\n======================" );

        } else if (userChoice==2 && computerChoice==3) {               //3
            System.out.println("Scissors betas paper ==> Computer +1  "+" Computer's Choice ->>"+computerChoice);
            comp++;
            System.out.println("User = "+ user + "| Computer = "+comp +"\n======================" );
//*--------------------------------------------------------------------------------------------------
        }  else if (computerChoice==1 && userChoice==2) {                       //1
                System.out.println("Paper beats rock ==> User +1   "+" Computer's Choice ->>"+computerChoice);
                user++;
                System.out.println("User = "+ user + "| Computer = "+comp +"\n======================" );

        } else if (computerChoice==1 && userChoice==3) {                //2
                System.out.println("Rock beats scissors ==> User +1  "+" Computer's Choice ->>"+computerChoice);
                user++;
                System.out.println("User = "+ user + "| Comp = "+comp+"\n======================"  );

        } else if (computerChoice==2 && userChoice==3) {               //3
                System.out.println("Scissors betas paper ==> User +1   "+" Computer's Choice ->>"+computerChoice);
                user++;
                System.out.println("User = "+ user + "| Comp = "+comp +"\n======================" );


        } else{
                System.out.println("It's a tie!"+" Computer's Choice ->>"+computerChoice);
                System.out.println("User = "+ user + "| Comp = "+comp +"\n======================" );
            }







        } while(user!=5 && comp!=5);{
            if (user> comp) System.out.println("****** You Are The Winner!!!! ******");
            else System.out.println("\n Sorry, You Have Lost!");


        }







    }
}
