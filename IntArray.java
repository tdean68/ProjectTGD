//Module 5 Assignment 1
//Timothy Dean

import java.util.Arrays;
import java.util.Random;

public class IntArray 
{
    private int length;
    private int myArray[];
    

    public IntArray(int InitialLength) //constructor to initialize the array with a certain number of elements
    {
        if (InitialLength < 0)
            {
            throw new IllegalArgumentException("Illegal Capacity: " + InitialLength);
        }
        this.myArray = new int[InitialLength];
        this.length = InitialLength;
    }

    public int size()  //method to return the number of elements in the array
    {
        return this.length;
    }

    public void fillRand() //method to fill the array with random numbers between 1 and 6
    {
        Random rand = new Random();
        for (int i = 0; i < this.length; i++)
             {
            this.myArray[i] = rand.nextInt(6) +1;
        }
    }

    public void set(int index, int value) //method to set a certain array element to a new value
    {
        if (index < 0 || index >= this.length) 
            {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + this.length);
        }
        this.myArray[index] = value;
    }

    public int get(int index) //method to get the value of a certain array element
    {
        if (index < 0 || index >= this.length) 
            {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + this.length);
        }
        return this.myArray[index];
    }

    public void clear() //method to clear the array, deleting the values and all the elements
    {
        this.myArray = null;
        this.length = 0;
    }

    public boolean isEmpty() //method to check if the array is empty
    {
        return this.length == 0 || this.myArray == null;
    }

    public void sort() //method to sort the array in ascending order
    {
        if (!isEmpty())
            {
            Arrays.sort(this.myArray, 0, this.length);
        }
    }

    public String toString() //method to return a string representation of the array
    {
        if (isEmpty())
            {
            return "[]";
        }

        int[] displayArr = Arrays.copyOf(this.myArray, this.length);
        return Arrays.toString(displayArr);
    }
}