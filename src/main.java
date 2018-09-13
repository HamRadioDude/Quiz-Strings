import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {

        int countScore = 0;
        String userAnswer;

        Scanner userInput = new Scanner(System.in);

        System.out.printf("%-10s", "\n");
        System.out.printf("%-100s", "WELCOME TO UNCLE BOBS FUNTORIUM!\n");
        System.out.printf("%-100s", "Are you ready to play some trivia?\n");
        System.out.printf("%-100s", "Press Y to play or N to exit the program\n");

        // System.out.printf("%-32s ", gun_store[x][i] + "  "); (from my last code and for reference)

        String userContinue = userInput.next();

        switch (userContinue) {
            case "Y":
            case "y":
                questions(countScore);
                break;

            case "N":
            case "n":
                System.exit(0);
            default:
                System.out.println("That was not a valid option, Try again");
                break;

        }

    }

    private static void questions(int counter) {
        Scanner userANS = new Scanner(System.in);                       //Initialize input for user answers


        for (int i = 0; i < 5; i++) {
            counter += 0;
            String answer1 = "1947";
            String answer2 = "12";
            String answer3 = "Vans";
            String answer4 = "Green";
            String answer5 = "Hootie and the Blowfish";
            String q1 = "\nWhat year was the United States Air Force Officially Established? ";
            String q2 = "\nWhat is the Square Root Of 144? ";
            String q3 = "\nWhat shoe company has the motto, 'Off The Wall?'";
            String q4 = "\nWhat color does Blue and Yellow make?";
            String q5 = "\nWhat band had the 1994 hit, Let Her Cry?";



       // Question 1 Start here

            System.out.println(q1);
            String input1 = userANS.next();

            if (input1.equalsIgnoreCase(answer1)) {

                System.out.println("That is correct!");
                counter ++;
            } else {
                System.out.println("That was not correct, the correct answer is " + answer1);
            }


        // Question 2 Start Here
            System.out.println(q2);
            input1 = userANS.next();

            if (input1.equalsIgnoreCase(answer2)) {

                System.out.println("That is correct!");
                counter ++;
            } else {
                System.out.println("That was not correct, the correct answer is " + answer2);
            }
        // Question 3 Start here
            System.out.println(q3);
            input1 = userANS.next();

            if (input1.equalsIgnoreCase(answer3)) {

                System.out.println("That is correct!");
                counter ++;
            } else {
                System.out.println("That was not correct, the correct answer is " + answer3);
            }
            // Question 4 Start here
            System.out.println(q4);
            input1 = userANS.next();

            if (input1.equalsIgnoreCase(answer4)) {

                System.out.println("That is correct!");
                counter ++;
            } else {
                System.out.println("That was not correct, the correct answer is " + answer4);
            }
            System.out.println(q5);
            input1 = userANS.next();

            if (input1.equalsIgnoreCase(answer5)) {

                System.out.println("That is correct!");
                counter ++;
            } else {
                System.out.println("That was not correct, the correct answer is " + answer5);


            }System.out.println("Amount Correct: " + counter);



          }
    }

}
