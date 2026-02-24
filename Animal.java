//Exam 1 Program
//Timothy Dean

public class Animal 
{
    private String species;

    public Animal() 
    {
        this.species = "animal";
    }

    public Animal(String species) 
    {
        this.species = species;
    }

    public String getSpecies() 
    {
        return species;
    }

    public void setSpecies(String species) 
    {
        this.species = species;
    }

    public String toString() 
    {
        return "Species: " + species;
    }
}