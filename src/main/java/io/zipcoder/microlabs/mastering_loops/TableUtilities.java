package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String output = "";
        for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++) {
                output += (((i*j) >= 10 ? " " : "  ") + (i * j) + " |");
            }
            output += "\n";
        }
        return output;
    }

    public static String getLargeMultiplicationTable() {
        String output = "";
        for (int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++) {
                output += (((i*j) >= 100 ? "" : " ") + ((i*j) < 10 ? " " : "")  + (i * j) + " |");
            }
            output += "\n";
        }
        return output;
    }

    public static String getMultiplicationTable(int tableSize) {
        String output = "";
        for (int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++) {
                output += (((i*j) >= 100 ? "" : " ") + ((i*j) < 10 ? " " : "")  + (i * j) + " |");
            }
            output += "\n";
        }
        return output;
    }
}
