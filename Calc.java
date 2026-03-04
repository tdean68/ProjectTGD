// Module 4 Assignment 1
// Timothy Dean

public class Calc
{
    // private data fields
    private double num1;
    private double num2;

    // get and set methods for num1 and num2
    public void setNum1(double n1)
    {
        num1 = n1;
    }
    public void setNum2(double n2)
    {
        num2 = n2;
    }
    public double getNum1()
    {
        return num1;
    }
    public double getNum2()
    {
        return num2;
    }

    // add
    public double add()
    {
        return num1 + num2;
    }

    // subtract
    public double subtract()
    {
        return num1 - num2;
    }

    // multiply
    public double multiply()
    {
        return num1 * num2;
    }

    // divide
    public double divide()
    {
        if(num2 != 0)
            {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

    //toString method to display the results of Runner File
    @Override
    public String toString()
    {
        return "Num1: " + num1 + "\n" + "Num2: " + num2 + "\n" + 
        "Displaying private data fields using toString():";
    }
}