package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder smallMultiBuilder = new StringBuilder();
        for (int i = 1; i <= 5; i++) {

            for (int w = 1; w <= 5; w++) {
                int productIW = i * w;
                smallMultiBuilder.append(String.format("%3d |", productIW));
            }
            smallMultiBuilder.append("\n");
        }
        return smallMultiBuilder.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder largeMultiplicationBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int w = 1; w <= 10; w++) {
                int productIW = i * w;
                largeMultiplicationBuilder.append(String.format("%3d |", productIW));
            }
            largeMultiplicationBuilder.append("\n");
        }
        return largeMultiplicationBuilder.toString();

    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multiplicationBuilder = new StringBuilder();
        for (int i = 1; i <= 20; i++) {

            for (int w = 1; w <= 20; w++) {
                int productIW = (i * w);
                multiplicationBuilder.append(String.format("%3d |", productIW));

            }
            multiplicationBuilder.append("\n");

        }
        return multiplicationBuilder.toString();
    }
}
