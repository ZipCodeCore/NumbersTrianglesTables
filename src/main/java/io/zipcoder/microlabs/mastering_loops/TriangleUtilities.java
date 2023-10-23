package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) { return null; }

    public static String getRow(int numberOfStars) {

        //The aim of using StringBuilder, i.e reducing memory. Is it achieved?
        //adding numberOfStars to StringBuilder allows for the length to be known up front
        StringBuilder stars = new StringBuilder(numberOfStars);
        //now we want to add * to the stars StringBuilder for the length of numberOfStars
        stars.append("*");
        //now we are returning our stars back to a string and it passes!!
        return stars.toString();

    }

    public static String getSmallTriangle() {

        StringBuilder shinyStar = new StringBuilder();

        int h, w;
        for (h = 1 ; h <= 4 ; h++) {
            for (w = 1 ; w <= h ; w++) {
                shinyStar.append("*");
            }
            shinyStar.append("\n");
        }

        return shinyStar.toString();
    }




    public static String getLargeTriangle() {

        StringBuilder bigStar = new StringBuilder();

        int ht, wd;
        for (ht = 1 ; ht <= 10 ; ht++) {
            for (wd = 1 ; wd <= ht ; wd++) {
                bigStar.append("*");
            }
            bigStar.append("\n");
        }

        return bigStar.toString();






    }
}
