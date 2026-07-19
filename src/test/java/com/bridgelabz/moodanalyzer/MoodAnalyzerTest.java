package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoodAnalyzerTest {
    // After refactoring code
    //Check for sad mood
    @Test
    void sadMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", moodAnalyzer.analyseMood());
    }

    //Check for happy mood
    @Test
    void happyMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY", moodAnalyzer.analyseMood());
    }


    @Test
    void givenNullMood_ShouldThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        MoodAnalysisException exception =
                assertThrows(MoodAnalysisException.class,
                        moodAnalyzer::analyseMood);
        assertEquals(MoodAnalysisException.ExceptionType.NULL_MOOD,
                exception.getType());
    }

    @Test
    void givenEmptyMood_ShouldThrowException() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");

        MoodAnalysisException exception =
                assertThrows(MoodAnalysisException.class,
                        moodAnalyzer::analyseMood);
        assertEquals(MoodAnalysisException.ExceptionType.EMPTY_MOOD,
                exception.getType());
    }
}

