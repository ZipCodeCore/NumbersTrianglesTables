package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {


        StringBuilder output = new StringBuilder();


        for (int i = 1; i <=5; ++i)
        {

            for (int j =1; j<=5; ++j)
            {

                int product = i*j;
                output.append(String.format("%3d |", product));
            }
            System.out.println();
            output.append("\n");
        }
        return output.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder output = new StringBuilder();


        for (int i = 1; i <=10; ++i)
        {

            for (int j =1; j<=10; ++j)
            {

                int product = i*j;
                output.append(String.format("%3d |", product));
            }
            System.out.println();
            output.append("\n");
        }
        return output.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder output = new StringBuilder();


        for (int i = 1; i <=tableSize; ++i)
        {

            for (int j =1; j<=tableSize; ++j)
            {

                int product = i*j;
                output.append(String.format("%3d |", product));
            }
            System.out.println();
            output.append("\n");
        }
        return output.toString();
    }
    }

