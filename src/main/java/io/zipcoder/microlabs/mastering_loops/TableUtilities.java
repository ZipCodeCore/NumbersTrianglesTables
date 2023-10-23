package io.zipcoder.microlabs.mastering_loops;

import com.sun.javafx.binding.StringFormatter;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder smallMulti = new StringBuilder();
        for (int h = 1; h <6; h++){
            for (int w=1; w <6; w++){
                smallMulti.append(String.format("%3d |", w*h));
            }
            smallMulti.append("\n");
        }

        return smallMulti.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder multi = new StringBuilder();
        for (int h =1; h < 11; h++){
            for (int w =1; w <11; w++){
                multi.append(String.format("%3d |", w*h));

            }
            multi.append("\n");
        }
        return multi.toString();

    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multiTable = new StringBuilder();
        for (int h =1; h < 21; h++){
            for (int w =1; w <21; w++){
                multiTable.append(String.format("%3d |", w*h));

            }
            multiTable.append("\n");
        }
        return multiTable.toString();

    }
}
