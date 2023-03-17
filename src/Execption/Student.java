package Execption;

public class Student {
    private String name;

    private double score;

    public Student(String name, double score) throws ScoreFormatExecption {
        this.name = name;
        if (score < 0 || score > 100)
            throw new ScoreFormatExecption("Invalid Score input");

        else
            this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
}