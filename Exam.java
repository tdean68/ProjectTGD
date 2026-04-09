//Module 6 Assignment 1
//Timothy Dean

public class Exam extends Assessment
{
    private int numQuestions;
    private int numMissed;
    private int pointsEach;

    public Exam(int questions, int missed)
    {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100 / questions;
        int score = 100 - (numMissed * pointsEach);
        setScore(score);
    }

    public int getPointsEach()
    {
        return pointsEach;
    }

    public int getNumMissed()
    {
        return numMissed;
    }
}