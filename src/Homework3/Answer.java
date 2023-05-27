package Homework3;

public class Answer {
    private final String text;
    private final boolean isCorrectAnswer;

    public Answer(String textOfAnswer, boolean isCorrectAnswer) {
        this.text = textOfAnswer;
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public String toString() {
        return this.text;
    }

    public boolean checkCorrectAnswer() {
        return isCorrectAnswer;
    }
}