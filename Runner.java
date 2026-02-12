//Timothy Dean
//CPSC 1302K - Computer Science II
//Module 3 Assignment 1b

import java.util.Scanner;
public class Runner
{
    public static void main(String[] args)
    {
        String type1 = "Dog";
        String name1 = "Goober";
        String sound1 = "Woof!";
        int age1 = 7;

        System.out.println("Pet Information: " + "\n" + type1);
        System.out.println("Name: " + name1);
        System.out.println("Sound: " + sound1);
        System.out.println("Age: " + age1);


        Scanner input = new Scanner(System.in);
         System.out.println("Enter Animal Type: ");
        String type = input.nextLine();
        System.out.println("Enter Animal Name: ");
        String name = input.nextLine();
        System.out.println("Enter Animal Age: ");
        int age = input.nextInt();

        Pet myPet = new Pet(name, type, age);
        System.out.println(myPet.toString());
        input.close();
    }

}
