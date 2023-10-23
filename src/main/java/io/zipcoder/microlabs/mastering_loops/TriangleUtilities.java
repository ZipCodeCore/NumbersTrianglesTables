package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder smallTri = new StringBuilder();

        String star = "*";

        for (int i = 1; i < numberOfRows; i++){
            for (int j = 0; j < i; j++) {
                smallTri.append(star);
            }
            smallTri.append("\n");
        }
        return smallTri.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder stars = new StringBuilder();

        String asterisk = "*";

        for (int i = 0; i < numberOfStars; i++){
            stars.append(asterisk);
        }
        return stars.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder smallTri = new StringBuilder();

        String star = "*";

        for (int i = 1; i < 5; i++){
            for (int j = 0; j < i; j++) {
                smallTri.append(star);
            }
        smallTri.append("\n");
        }
        return smallTri.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder smallTri = new StringBuilder();

        String star = "*";

        for (int i = 1; i < 10; i++){
            for (int j = 0; j < i; j++) {
                smallTri.append(star);
            }
            smallTri.append("\n");
        }
        return smallTri.toString();
    }
}
