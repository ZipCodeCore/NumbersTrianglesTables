package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int count = 1; count <= 5; count++) {
            for (int count2 = 1; count2 <= 5; count2++) {
                String a = String.format("%3d |", count * count2);
                table.append(a);

            }
            table.append("\n");

        }

        return table.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int count = 1; count <= 10; count++) {
            for (int count2 = 1; count2 <= 10; count2++) {
                String a = String.format("%3d |", count * count2);
                table.append(a);

            }
            table.append("\n");

        }

        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int count = 1; count <= tableSize; count++) {
            for (int count2 = 1; count2 <= tableSize; count2++) {
                String a = String.format("%3d |", count * count2);
                table.append(a);

            }
            table.append("\n");

        }

        return table.toString();
    }
}

