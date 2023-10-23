package io.zipcoder.microlabs.mastering_loops;


public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        //so I don't have to concatenate every string, I named it times
        //my first for loop, created to look ht(height), the dimension is defined in the middle
        //my 2nd for loop, created to look width(width), the dimension is defined in the middle
        /*I actually got this portion from student help but I know what it means. The append
         goes along with the string builder and times is just the title. String format will create a
         formatted string without having to printf it. The %3 represents the field width of, "d" is decimal
         integer, space, pipe, by the value of 1.
         */
        //and then we are returning times to a string format and it passed.

        //you have to append outside the inside loop because that loop PRINTS A ROW!

        StringBuilder times = new StringBuilder();

        for (int ht=1; ht<6; ht++){
            for (int wd=1; wd<6; wd++){
                times.append(String.format("%3d |", wd*ht));
            }
            times.append("\n");
        }
        return times.toString();
    }





    public static String getLargeMultiplicationTable() {
        StringBuilder timest = new StringBuilder();

        for (int h=1; h<11; h++){
            for (int w=1; w<11; w++){
                timest.append(String.format("%3d |", w*h));
            }
            timest.append("\n");
        }
        return timest.toString();
    }



    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multit = new StringBuilder();

        for (int n=1; n<21; n++){
            for (int w=1; w<21; w++){
                multit.append(String.format("%3d |", w*n));
            }
            multit.append("\n");
        }
        return multit.toString();
    }







    }

