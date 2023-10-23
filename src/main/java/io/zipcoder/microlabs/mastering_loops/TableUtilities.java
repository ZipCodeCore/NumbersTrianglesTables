package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder myString = new StringBuilder();

        for (int i = 1; i < 6; i++) {

            for (int j = 1; j < 6; j++) {

                myString.append(String.format("%3d |", i * j));


            }

            myString.append("\n");

        }

        return myString.toString();

    }

    public static String getLargeMultiplicationTable() {

            StringBuilder myString = new StringBuilder();

            for (int i = 1; i < 11; i++) {

                for (int j = 1; j < 11; j++) {

                    myString.append(String.format("%3d |", i*j));

                }

                myString.append("\n");

            }

            return myString.toString();

    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder myString = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {

                myString.append(String.format("%3d |", i*j));

            }

            myString.append("\n");

        }

        return myString.toString();

    }
}
