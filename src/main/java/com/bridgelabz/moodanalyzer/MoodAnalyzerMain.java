package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerMain {

    public static void main(String[] args) {
        // Create object using parameterized constructor
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);

        // Display Mood
        System.out.println(moodAnalyzer.analyseMood());
    }
}
