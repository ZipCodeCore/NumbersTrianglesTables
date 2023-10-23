package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String myTable = "";

        for (int row =1; row <=5; row++){
            for (int col=1; col<=5; col++){

                int checkSpace = col*row;
                if (checkSpace < 10) {
                    myTable += " " + checkSpace + " | ";
                } else if (checkSpace >= 10){
                    myTable += " " + checkSpace + " | ";
                }

            }
            myTable += "\n";
        }

        return myTable;
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder getLarge = new StringBuilder();
        for (int row=1; row <11 ; row++){
            for (int col=1; col<11; col++){
                getLarge.append(col*row + " | ");
            }
           getLarge.append("\n");

        }

        return getLarge.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder getMult = new StringBuilder();
        for (int row = 1; row <= tableSize; row++){
            for (int col = 1; col <= tableSize; col++){
                getMult.append(row * col + " | ");
            }
            getMult.append("\n");
        }

        return getMult.toString();
    }
}
