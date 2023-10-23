package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder answer = new StringBuilder();

        int columnCounter = 1;
        int rowCounter = 1;
        int input = 1;
        for (int i = 1; i<= 25; i++){

            String cell = String.format("%3d |", input);
            answer.append(cell);
            columnCounter++;
            input = rowCounter*columnCounter;
            if (columnCounter == 6){
                answer.append("\n");
                columnCounter = 1;
                rowCounter++;
                input = rowCounter;

            }
        }

        return answer.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder answer = new StringBuilder();

        int columnCounter = 1;
        int rowCounter = 1;
        int input = 1;
        for (int i = 1; i<= 100; i++){

            String cell = String.format("%3d |", input);
            answer.append(cell);
            columnCounter++;
            input = rowCounter*columnCounter;
            if (columnCounter == 11){
                answer.append("\n");
                columnCounter = 1;
                rowCounter++;
                input = rowCounter;

            }
        }

        return answer.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder answer = new StringBuilder();

        int columnCounter = 1;
        int rowCounter = 1;
        int input = 1;
        for (int i = 1; i<= tableSize*tableSize; i++){

            String cell = String.format("%3d |", input);
            answer.append(cell);
            columnCounter++;
            input = rowCounter*columnCounter;
            if (columnCounter == tableSize+1){
                answer.append("\n");
                columnCounter = 1;
                rowCounter++;
                input = rowCounter;

            }
        }

        return answer.toString();
    }
}
