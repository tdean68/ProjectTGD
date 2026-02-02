//Timothy Dean
//CPSC 1302K - Computer Science II
//Module 2 Assignment 2

public class Pet {
    //private data fields
    private String name;

//public constructor(s)

public Pet()
{
    this.setName("Goober");
}

// public set or mutator method fpr every private data field (except when the data is read-only)
public void setName(String newName)
{
    this.name = newName;
}
// public get or accessor for every private data field (except if it is a secret)
public String getName()
{
    return this.name;
}
// public toString method that prints out all of the object state (meaning the data in th eobject instance that you will later instantiate in the main() method)
public String toString()
{
    return "Pet Information: " + "\n" + this.name;
}
// main method for testing
public static void main(String[] args) 
{
    String dog1 = "Goober";
    Pet myPet1 = new Pet();
   
    System.out.println("Pet Information: " + "\n" + dog1);
    System.out.println(myPet1.toString());   
}
}
