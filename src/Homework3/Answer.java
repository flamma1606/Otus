package Homework3;

public class Answer {
    private final String text;
    private final boolean isCorrectAnswer;

    public Answer(String textOfAnswer, boolean isCorrectAnswer) {
        this.isCorrectAnswer = isCorrectAnswer;
        this.text = textOfAnswer;
    }

        public String getAnswer() {
        return this.text;
    }

    public boolean checkCorrectAnswer() {
        return isCorrectAnswer;
    }

}