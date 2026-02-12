//Timothy Dean
//CPSC 1302K - Computer Science II
//Module 3 Assignment 1a

public class Pet
{
    //private data fields
    private String name;
    private String type;
    private int age;


//public constructor(s)

public Pet( String newName, String newType, int newAge)
{
    setName(newName);
    setType(newType);
    setAge(newAge);
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

public void setType(String newType)
{
    this.type = newType;
}

public String getType()
{
    return this.type;
}

public void setAge(int newAge)
{
    this.age = newAge;
}

public int getAge()
{
    return this.age;
}

// Animal Sound
  public String speak() {
        String sound;
        if (type.equalsIgnoreCase("cow"))
        {
            sound = "Moo!";
        } else if (type.equalsIgnoreCase("sheep")) {
            sound = "Baa!";
        } else {
            sound = "Unknown Noise";
        }
        return sound;
    }
// public toString method that prints out all of the object state (meaning the data in th eobject instance that you will later instantiate in the main() method)
public String toString()
{
      String state = "Pet Information:\n";
        state += "Type: " + type + "\n";
        state += "Name: " + name + "\n";
        state += "Sound: " + speak() + "\n";
        state += "Age: " + age + "\n";
        return state;
}

}