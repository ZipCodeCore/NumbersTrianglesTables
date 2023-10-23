package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder smallMult = new StringBuilder();
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                int colRow = col * row;
                smallMult.append(String.format("%3d |", colRow));
            }
            smallMult.append("\n");
        }
        return smallMult.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder largeMult = new StringBuilder();
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                int colRow = col * row;
                largeMult.append(String.format("%3d |", colRow));
            }
            largeMult.append("\n");
        }
        return largeMult.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multTab = new StringBuilder();
        for (int row = 1; row <= tableSize; row++) {
            for (int col = 1; col <= tableSize; col++) {
                int colRow = col * row;
                multTab.append(String.format("%3d |", colRow));
            }
            multTab.append("\n");
        }
        return multTab.toString();
    }
}
