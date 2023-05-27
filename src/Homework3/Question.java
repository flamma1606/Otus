package Homework3;

import java.util.List;

public class Question {
    private final String text;
    private final List<Answer> answers;
    private boolean isTrue;

    public Question(String textOfQuestion, List<Answer> answers) {
        this.text = textOfQuestion;
        this.answers = answers;
    }

    public String getQuestion() {
        return this.text;
    }
    public List<Answer> getAnswers() {
        return this.answers;
    }

    }
