package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int row =1; row <numberOfRows; row++)
        {
            for (int column =0;column < row; column++)
            {
                triangle.append("*");
            }
           triangle.append("\n");
        }
        return triangle.toString();
    }





    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int w=1; w < 21; w++){

                row.append("*");


        }
        return row.toString();


    }

    public static String getSmallTriangle() {
        StringBuilder smallTriangle = new StringBuilder();
        for (int row =1; row <5; row++)
        {
            for (int column =0;column < row; column++)
            {
                smallTriangle.append("*");
            }
            smallTriangle.append("\n");
        }
        return smallTriangle.toString();
    }

    public static String getLargeTriangle() {

        StringBuilder largeTriangle = new StringBuilder();
        for (int row =1; row <10; row++)
        {
            for (int column =0;column < row; column++)
            {
                largeTriangle.append("*");
            }
            largeTriangle.append("\n");
        }
        return largeTriangle.toString();
    }

}

