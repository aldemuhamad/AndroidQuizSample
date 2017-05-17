package com.example.aldemuhamad.androidquiz;

/**
 * Created by aldemuhamad on 5/14/2017.
 */

public class QuestionBank {

    private String textQuestions [] = {
            "1. WHen did Google acquired Android?",
            "2. What is the name of build toolkit for Android Studio",
            "3. What widget can replace any use of radio buttons?",
            "4. Android application implements principle of ____."
    };

    private String multipleChoice [][] = {
            {"2003", "2004", "2005", "2006"},
            {"JVM", "Gradle", "Dalvik", "HAXM"},
            {"Toogle Button", "Spinner", "Switch Button", "ImageButton"},
            {"least privilege", "nost privileges", "unique privilege", "none of the above"}
    };

    private String mCorrectAnswers[] = {"2005", "Gradle", "Spinner", "least privileges"};

    public int getLength(){return textQuestions.length;}

    public String getQuestion(int a){
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
