// Module 8 Assignment 1
// Timothy Dean

import java.io.*;

public class M8A1 
{
    public static void main(String[] args) 
    {
        String inputFile = "pay.csv"; // Input file name
        String outputFile = "output.csv"; // Output file name
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile)); // Manages resources by ensuring they are closed at the end of the statement
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) // Manages resources by ensuring they are closed at the end of the statement
             {
            
            
            bw.write("EmpID,Pay Rate,Hours Worked,Weekly Pay"); // Write the header line
            bw.newLine();
            
            String line; // Read header line from the input file
           
            br.readLine();
            while ((line = br.readLine()) != null)  // Read each line of the input file until the end is reached
                {
                String[] parts = line.split(","); // Split the line into parts using commas
                if (parts.length >= 3) // Check if there are at least 3 parts (EmpID, Pay Rate, Hours Worked)
                    {
                    String EmpID = parts[0];
                    double PayRate = Double.parseDouble(parts[1]);
                    double hours = Double.parseDouble(parts[2]);
                    
                    double pay; // Calculate the weekly pay based on the hours worked and the pay rates
                    if (hours <= 40) 
                        {
                        pay = PayRate * hours;
                    } 
                    else 
                        {
                        pay = PayRate * 40 + PayRate * 1.5 * (hours - 40);
                    }
                    
                    String payStr = String.format("$%.2f", pay); // Format the pay as a string with two decimal places and a dollar sign
                    
                    // Write the output line
                    bw.write(EmpID + "," + parts[1] + "," + parts[2] + "," + payStr); // Write the employee ID, pay rate, hours worked, and weekly pay
                    bw.newLine();
                }
            }
        } 
        catch (IOException e) // Catch any IO exceptions that may occur
        {
            e.printStackTrace(); // Print the stack trace for debugging purposes
        }
        
        System.out.println("Output file 'output.csv' has been created successfully."); //Lets the user know that the output file has been created successfully
    }
}