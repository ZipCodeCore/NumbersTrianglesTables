package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder answer = new StringBuilder();
        int rowCounter = 1;
        for(int i = 1; i<= numberOfRows-1; i++){
            for(int j = 1; j<=rowCounter; j++) {
                answer.append("*");
                if (j == rowCounter) {
                    answer.append("\n");
                    rowCounter++;
                    break;
                }
            }
        }
        return answer.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i<= numberOfStars; i++){
            answer.append("*");
        }
        return answer.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder answer = new StringBuilder();
        int rowCounter = 1;
        for(int i = 1; i<= 4; i++){
            for(int j = 1; j<=rowCounter; j++) {
                answer.append("*");
                if (j == rowCounter) {
                    answer.append("\n");
                    rowCounter++;
                    break;
                }
            }
        }
        return answer.toString();

    }

    public static String getLargeTriangle() {

        StringBuilder answer = new StringBuilder();
        int rowCounter = 1;
        for(int i = 1; i<= 9; i++){
            for(int j = 1; j<=rowCounter; j++) {
                answer.append("*");
                if (j == rowCounter) {
                    answer.append("\n");
                    rowCounter++;
                    break;
                }
            }
        }
        return answer.toString();

    }
}
