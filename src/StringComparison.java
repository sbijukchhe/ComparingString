/*
Fix the following program so it works.Note: To keep you on your feet the complete program is not shown. It's up to you to figure out the rest.

Add a line to print "You should stay inside" if the response is "stormy".

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer == "rain") {
            System.out.println("Take your umbrella!");
        } else if (answer == "windy") {
            System.out.println("Wear your jacket!");
        } else if (answer == "snow") {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
     }

 */

import java.util.Scanner;

public class StringComparison {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("rain")) {
            System.out.println("Take your umbrella!");
        } else if (answer.equalsIgnoreCase("windy")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equalsIgnoreCase("snow")) {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
    }
}
