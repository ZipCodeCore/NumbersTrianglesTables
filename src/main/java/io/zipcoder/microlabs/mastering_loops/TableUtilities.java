package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table =
                "  1 |  2 |  3 |  4 |  5 |\n" +
                "  2 |  4 |  6 |  8 | 10 |\n" +
                "  3 |  6 |  9 | 12 | 15 |\n" +
                "  4 |  8 | 12 | 16 | 20 |\n" +
                "  5 | 10 | 15 | 20 | 25 |\n";
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table =
                        "  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |\n" +
                        "  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |\n" +
                        "  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |\n" +
                        "  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |\n" +
                        "  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |\n" +
                        "  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |\n" +
                        "  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |\n" +
                        "  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |\n" +
                        "  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |\n" +
                        " 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |\n";
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            table.append(String.format("%3d |", i));
            for (int j = 2; j <= tableSize; j++){
                table.append(String.format("%3d |", i*j));
            }
            table.append("\n");
        }
        return table.toString();
    }
}
