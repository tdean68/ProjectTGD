//Module 6 Assignment 1
//Timothy Dean

public class Exam extends Assessment
{
    private int numQuestions; // Number of questions on the exam
    private int numMissed; // Number of questions missed
    private int pointsEach; // Points awarded for each question

    public Exam(int questions, int missed)
    {
        this.numQuestions = questions; // Set the number of questions, missed questions, and calculate points each
        this.numMissed = missed; 
        this.pointsEach = 100 / questions; // Calculate the score and set it using the setScore method from the Assessment class
        int score = 100 - (numMissed * pointsEach); // Set the score using the setScore method from the Assessment class
        setScore(score);
    }

    public int getPointsEach()
    {
        return pointsEach; // Return the points each question is worth
    }

    public int getNumMissed() 
    {
        return numMissed; // Return the number of questions missed
    }
}