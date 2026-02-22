// Module 3 Assignment 2
// Timothy Dean

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests 
{
    private double average;
    private double sumOfScores;
    private int countOfScores;
    
    public Tests() {
        this.average = 0.0;
        this.sumOfScores = 0.0;
        this.countOfScores = 0;
        
    }

    public void getAverage() 
    {
        Scanner input = new Scanner(System.in);

        double Sum = 0.0;
        int Count = 0;
        int score;

        System.out.println("Please enter test scores (Type -1 to quit)");

        do 
        {
            System.out.print("Enter a test score: ");
            if (input.hasNextInt()) {
                score = input.nextInt();
                if (score != -1) 
                    {
                    Sum += score;
                    Count++;
                }
            } else 
                {
                System.out.println("Please enter Score");
                input.next();
                score = 0;
            }
        } 
        while (score != -1);
        
        input.close();

            this.sumOfScores = Sum; 
        this.countOfScores = Count;

        if (Count > 0) 
            {
            this.average = Sum / Count;
        } 
        else 
            {
            this.average = 0.0;
        }
    }

    public String toString() 
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Number of test scores that have been entered is " + countOfScores + 
               "\nThe average test score is " + df.format(average);
    }

    public double getSumOfScores() 
    {
        return sumOfScores;
    }

    public int getCountOfScores() {
        return countOfScores;
    }

    public double getAverageValue() {
        return average;
    }
}