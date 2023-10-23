package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {

        StringBuilder smallMult = new StringBuilder();


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

            smallMult.append(String.format("%3d |", i*j));
            }
        smallMult.append("\n");
        }
        String completedTable = smallMult.toString();
        return completedTable;
    }


    public static String getLargeMultiplicationTable() {

        StringBuilder largeMult = new StringBuilder();


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                largeMult.append(String.format("%3d |", i*j));
            }
            largeMult.append("\n");
        }
        String completedTable = largeMult.toString();
        return completedTable;
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder multTable = new StringBuilder();

        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                multTable.append(String.format("%3d |", i*j));
            }
            multTable.append("\n");
        }

        String completedTable = multTable.toString();
        return completedTable;

    }

}
