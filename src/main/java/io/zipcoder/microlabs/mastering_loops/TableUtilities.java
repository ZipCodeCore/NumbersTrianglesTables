package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int width = (int)Math.floor(Math.log10(5 * 5)) + 2;
        String format = "%" + width + "d |";
        StringBuilder b = new StringBuilder(5 * width);
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                b.append(String.format(format, row * col));
            }
            b.append("\n");
        }
        return b.toString();
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        int width = (int)Math.floor(Math.log10(tableSize * tableSize)) + 1;
        String format = "%" + width + "d |";
        StringBuilder b = new StringBuilder(tableSize * width);
        for (int row = 1; row <= tableSize; row++) {
            for (int col = 1; col <= tableSize; col++) {
                b.append(String.format(format, row * col));
            }
            b.append("\n");
        }
        return b.toString();
    }
}
