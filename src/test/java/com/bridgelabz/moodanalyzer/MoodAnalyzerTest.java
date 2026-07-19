package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    // After refactoring code
    //Check for sad mood
    @Test
    void sadMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", moodAnalyzer.analyseMood());
    }

    //Check for happy mood
    @Test
    void happyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY", moodAnalyzer.analyseMood());
    }
}
