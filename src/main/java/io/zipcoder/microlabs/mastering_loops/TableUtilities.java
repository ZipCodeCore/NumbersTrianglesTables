package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    /**
     *
     * @return a formatted multiplication table of various sizes
     */

    public String getSmallMultiplicationTable() {
        StringBuilder smallTable = new StringBuilder();
        for (int i = 1; i < 6; i++) {
            StringBuilder grow = new StringBuilder();
            for (int a = 1; a < 6; a++) {
                int b = a * i;
                grow.append(String.format("%3d", b)).append(" |");
            }

            smallTable.append(grow).append("\n");
        }

        return smallTable.toString();
    }

    public String getLargeMultiplicationTable() {
        StringBuilder bigTable = new StringBuilder();
        for (int i = 1; i < 11; i++) {
            StringBuilder grow = new StringBuilder();
            for (int a = 1; a < 11; a++) {
                int b = a * i;
                grow.append(String.format("%3d", b)).append(" |");
            }

            bigTable.append(grow).append("\n");
        }

        return bigTable.toString();
    }

    public String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i < 21; i++) {
            StringBuilder grow = new StringBuilder();
            for (int a = 1; a < 21; a++) {
                int b = a * i;
                grow.append(String.format("%3d", b)).append(" |");
            }

            table.append(grow).append("\n");
        }

        return table.toString();
    }
}