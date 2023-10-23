package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder sm = new StringBuilder();

        for (int x = 1; x <= 5; x++) {
            for(int y = 1; y <= 5; y++) {

                sm.append(String.format("%3d |", x * y));
            }
            sm.append("\n");
        }


        return sm.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sm = new StringBuilder();

        for (int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++) {

                sm.append(String.format("%3d |", x * y));
            }
            sm.append("\n");
        }


        return sm.toString();
    }



    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sm = new StringBuilder();

        for (int x = 1; x <= tableSize; x++) {
            for(int y = 1; y <= tableSize; y++) {

                sm.append(String.format("%3d |", x * y));
            }
            sm.append("\n");
        }


        return sm.toString();
    }
    }

