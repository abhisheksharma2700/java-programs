package com.map;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @Column(name = "Question_Id")
    private int questionId;
    private String question;
    @OneToMany(mappedBy = "question")
    private List<Answer> answer;



    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
