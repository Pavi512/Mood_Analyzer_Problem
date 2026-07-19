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
    public String analyseMood() throws MoodAnalysisException {
        try {
            // Check for Empty Mood
            if (message.isEmpty()) {
                throw new MoodAnalysisException(
                        MoodAnalysisException.ExceptionType.EMPTY_MOOD,
                        "Mood should not be Empty");
            }
            // Check whether the message contains Sad
            if (message.contains("Sad")) {
                return "SAD";
            }
            // Otherwise return HAPPY
            return "HAPPY";
        }
        catch (NullPointerException e) {
            // Throw for NULL mood
            throw new MoodAnalysisException(
                    MoodAnalysisException.ExceptionType.NULL_MOOD,
                    "Mood should not be Null");
        }
    }
}
