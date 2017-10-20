package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //: When
        String actual = shapes.triangle();

        //: Then
        Assert.assertEquals("that's my \u25B5", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected =   "tableSquares(4)\n" +
                            "*** Output ***\n" +
                            "A 4 x 4 table square\n" +
                            "|  1 |  2 |  3 |  4 |\n" +
                            "|  2 |  4 |  6 |  8 |\n" +
                            "|  3 |  6 |  9 | 12 |\n" +
                            "|  4 |  8 | 12 | 16 |";

        //: When
        String actual = shapes.tableSquare(4);

        //: Then
        Assert.assertEquals("that's my square", expected, actual);
    }

    @Test
    public void tableSquareNTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected =   "tableSquares(6)\n" +
                "*** Output ***\n" +
                "A 6 x 6 table square\n" +
                "|  1 |  2 |  3 |  4 |  5 |  6 |\n" +
                "|  2 |  4 |  6 |  8 | 10 | 12 |\n" +
                "|  3 |  6 |  9 | 12 | 15 | 18 |\n" +
                "|  4 |  8 | 12 | 16 | 20 | 24 |\n" +
                "|  5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "|  6 | 12 | 18 | 24 | 30 | 36 |";

        //: When
        String actual = shapes.tableSquares(6);

        //: Then
        Assert.assertEquals("that's my square", expected, actual);
    }
}


