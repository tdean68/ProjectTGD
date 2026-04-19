// Module 7 Assignment 1
// Timothy Dean

import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions = 0;    // Number of questions
            int missed = 0;       // Number of questions missed

            // Get the number of questions on the exam
            input = JOptionPane.showInputDialog("How many questions are on the exam?"); //  Validate input and handle exceptions
            try {
                questions = Integer.parseInt(input); 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for questions."); // Exit the program if input is invalid
                System.exit(1);
            }

            // Get the number of questions the student missed
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            try {
                missed = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for missed questions."); // Exit the program if input is invalid
                System.exit(1);
            }

            // Create an Exam object
            try {
                Exam exam = new Exam(questions, missed);

                // Display the test results
                String message = "Each question counts " + exam.getPointsEach(); // Display the points each question is worth, the number of questions missed, the exam score, and the exam grade
                message += " points.\nThe exam score is " + exam.getScore(); 
                message += "\nThe exam grade is " + exam.getGrade();
                JOptionPane.showMessageDialog(null, message); // Handle the case where the number of questions is zero to avoid division by zero
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Number of questions cannot be zero."); // Exit the program if number of questions is zero
            }

            System.exit(0);
        }
    }
