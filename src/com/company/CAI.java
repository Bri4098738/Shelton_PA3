package com.company;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI
{

    static int answer;
    static int userLevel;
    static int problemType;

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        int score = 0;
        System.out.println("Please choose a difficulty from level 1 to 4");
        userLevel = scnr.nextInt();

        System.out.println("What type of problem?\n1 is +\n2 is *\n3 is -\n4 is /");
        problemType = scnr.nextInt();

        String theQuestion = "";


        int i=0;
        for(i=0; i<10; i++)
        {
            if (userLevel==1)
            {theQuestion = getQuestion1();}
            else if (userLevel==2)
            {theQuestion = getQuestion2();}
            else if (userLevel==3)
            {theQuestion = getQuestion3();}
            else
            {theQuestion = getQuestion4();}
            System.out.println(theQuestion);
            int userAnswer = scnr.nextInt();
            if (userAnswer == answer)
            {
                correct();
                score = score + 1;
            }
            else
            {
                wrong();
            }

        }
        int grade = score * 10;
        System.out.println("You scored "+ grade + "!\nYou needed a 75 or higher to pass.");
        if (grade>=75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }


    }

    public static String getQuestion1() {

        SecureRandom rand = new SecureRandom();
        int firstNum = rand.nextInt(10);
        int secondNum = rand.nextInt(10);
        String problemCat;
        if (problemType==1)
        {problemCat = "plus";
            answer = firstNum + secondNum;}
        else if (problemType==2)
        {problemCat = "times";
            answer = firstNum * secondNum;}
        else if (problemType==3)
        {problemCat = "minus";
            answer = firstNum - secondNum;}
        else
        {problemCat = "divided by";
            answer = firstNum / secondNum;}

        String question = "How much is " + firstNum + " " + problemCat + " " + secondNum + "?";

        return question;
    }

    public static String getQuestion2() {

        SecureRandom rand = new SecureRandom();
        int firstNum = rand.nextInt(100);
        int secondNum = rand.nextInt(100);
        String problemCat;
        if (problemType==1)
        {problemCat = "plus";
            answer = firstNum *+ secondNum;}
        else if (problemType==2)
        {problemCat = "times";
            answer = firstNum * secondNum;}
        else if (problemType==3)
        {problemCat = "minus";
            answer = firstNum - secondNum;}
        else
        {problemCat = "divided by";
            answer = firstNum / secondNum;}

        String question = "How much is " + firstNum + " " + problemCat + " " + secondNum + "?";

        return question;
    }

    public static String getQuestion3() {

        SecureRandom rand = new SecureRandom();
        int firstNum = rand.nextInt(1000);
        int secondNum = rand.nextInt(1000);
        String problemCat;
        if (problemType==1)
        {problemCat = "plus";
            answer = firstNum *+ secondNum;}
        else if (problemType==2)
        {problemCat = "times";
            answer = firstNum * secondNum;}
        else if (problemType==3)
        {problemCat = "minus";
            answer = firstNum - secondNum;}
        else
        {problemCat = "divided by";
            answer = firstNum / secondNum;}

        String question = "How much is " + firstNum + " " + problemCat + " " + secondNum + "?";

        return question;
    }

    public static String getQuestion4() {

        SecureRandom rand = new SecureRandom();
        int firstNum = rand.nextInt(10000);
        int secondNum = rand.nextInt(10000);
        String problemCat;
        if (problemType==1)
        {problemCat = "plus";
            answer = firstNum *+ secondNum;}
        else if (problemType==2)
        {problemCat = "times";
            answer = firstNum * secondNum;}
        else if (problemType==3)
        {problemCat = "minus";
            answer = firstNum - secondNum;}
        else
        {problemCat = "divided by";
            answer = firstNum / secondNum;}

        String question = "How much is " + firstNum + " " + problemCat + " " + secondNum + "?";

        return question;
    }


    public static void wrong() {
        SecureRandom rand = new SecureRandom();
        int wrongAnswer = rand.nextInt(5);

        switch (wrongAnswer) {
            case 1:
                System.out.println("No. Please try again.");
                break;

            case 2:
                System.out.println("Wrong. Try once more.");
                break;

            case 3:
                System.out.println("Don’t give up!");
                break;

            default:
                System.out.println("No. Keep trying.");

        }
    }

    public static void correct() {
        SecureRandom rand = new SecureRandom();
        int correctAnswer = rand.nextInt(5);

        switch (correctAnswer) {
            case 1:
                System.out.println("Very good!");
                break;

            case 2:
                System.out.println("Excellent!");
                break;

            case 3:
                System.out.println("Nice work!");
                break;

            default:
                System.out.println("Keep up the good work!");

        }
    }

}