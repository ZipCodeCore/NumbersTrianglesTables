package io.zipcoder.microlabs.mastering_loops;

import java.lang.reflect.Array;
import java.util.*;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder smallMultiplicationTable = new StringBuilder();
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int num=i*j;
                smallMultiplicationTable.append(String.format("%3d |",num));
            }smallMultiplicationTable.append("\n");

        }


        String myTable = smallMultiplicationTable.toString();
        return myTable;
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder smallMultiplicationTable = new StringBuilder();
        for(int i = 1;i<=10;i++){
            for(int j=1;j<=10;j++){
                int num=i*j;
                smallMultiplicationTable.append(String.format("%3d |",num));
            }smallMultiplicationTable.append("\n");

        }


        String myTable = smallMultiplicationTable.toString();
        return myTable;

    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder smallMultiplicationTable = new StringBuilder();
        for(int i = 1;i<=tableSize;i++){
            for(int j=1;j<=tableSize;j++){
                int num=i*j;
                smallMultiplicationTable.append(String.format("%3d |",num));
            }smallMultiplicationTable.append("\n");

        }


        String myTable = smallMultiplicationTable.toString();
        return myTable;
    }
}
