package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerMain {

    public static void main(String[] args) {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            System.out.println(moodAnalyzer.analyseMood());
        }
        catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }
    }
}
