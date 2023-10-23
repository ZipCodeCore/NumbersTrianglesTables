package io.zipcoder.microlabs.mastering_loops;


public class TableUtilities
{
    public static String getSmallMultiplicationTable()
    {
        //stringBuilder are mutable/can be changed
        StringBuilder smallMultiplicationTable = new StringBuilder();

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j<= 5; j++)
            {

                int num = i * j;
                smallMultiplicationTable.append(String.format("%3d |", num));

            } smallMultiplicationTable.append("\n");


        }

        String myTable = smallMultiplicationTable.toString();
        return myTable;



    }

    public static String getLargeMultiplicationTable() {

        StringBuilder largeMultiplicationTable = new StringBuilder();

        for (int i = 1; i <= 10; i++)
        {

            for (int j = 1; j <= 10; j++)
            {
                int num = i  * j;
                largeMultiplicationTable.append(String.format("%3d |", num));

            } largeMultiplicationTable.append("\n");
        }

        String largeTable = largeMultiplicationTable.toString();
        return largeTable;
    }

    public static String getMultiplicationTable(int tableSize) {



            StringBuilder multiplicationTable = new StringBuilder();

            for (int i = 1; i <= tableSize; i++){

                for (int j = 1; j <= tableSize; j++){

                    int num = i * j;
                    multiplicationTable.append(String.format("%3d |", num));

                } multiplicationTable.append(String.format("\n"));

            }

            String myTable = multiplicationTable.toString();
            return myTable;


        }

    }

