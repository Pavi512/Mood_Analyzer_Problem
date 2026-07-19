package com.bridgelabz.moodanalyzer;

// Custom Exception
public class MoodAnalysisException extends Exception {

    // Enum for exception type
    enum ExceptionType {
        NULL_MOOD,
        EMPTY_MOOD
    }

    final ExceptionType type;

    // Constructor
    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }
}


