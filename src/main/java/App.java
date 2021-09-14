import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        final int LEGAL_AGE = 16;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scanner.nextInt();
        String result = (age < LEGAL_AGE) ? new String("are not") : new String("are");
        System.out.println(String.format("You %s old enough to drive.", result));
    }
}
