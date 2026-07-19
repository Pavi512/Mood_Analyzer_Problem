package com.bridgelabz.moodanalyzer;

//Refactor code added constructors
public class MoodAnalyzer {
    private String message;

    // Default Constructor
    public MoodAnalyzer() {
    }

    // Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // Analyse mood
    public String analyseMood() {
        try {
            // Check whether the message contains Sad
            if (message.contains("Sad")) {
                return "SAD";
            }
            // Otherwise return HAPPY
            return "HAPPY";
        }
        catch (NullPointerException e) {
            return "Null value";
        }
    }
}
