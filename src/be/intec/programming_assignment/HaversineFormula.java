package be.intec.programming_assignment;

class GreatCircle {

    public static void main(String args[]) {


        /*
        Floating-point numbers and the Math library.
        The great-circle distance is the length of
        the shortest path between two points (x1,y1) and (x2,y2)
        on the surface of a sphere,
        where the path is constrained to be along the surface.

        Write a program GreatCircle.java
        that takes four double command-line arguments x1, y1, x2, and y2-the latitude
        and longitude (in degrees)
        of two points on the surface of
        the earth-and prints the great-circle distance (in kilometers)
        between them. Use the following Haversine formula:

distance=2*r*arcsin(√((sin²((x2-x1)/2)+cosx1cosx2sin²((y2-y1)/2))))

where r=6,371.0 is the mean radius of the Earth (in kilometers).

Hint: The command-line arguments are given in degrees
but Java’s trigonometric functions use radians.
Use Math.toRadians() to convert from degrees to radians.

Although the Earth is not a perfect sphere,
this formula is a good approximation to the true distance.


Example:

~/Desktop/hello> javac GreatCircle.java

~/Desktop/hello> java GreatCircle 40.35 74.65 48.87 -2.33    // Princeton to Paris
5902.927099258561 kilometers

~/Desktop/hello> java GreatCircle 60.0 15.0 120.0 105.0      // for debugging
4604.53989281927 kilometers


         */
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

// distance between latitudes and longitudes
        double dLatitude = Math.toRadians(x2 - x1);
        double dLongitude = Math.toRadians(y2 - y1);

// convert to radians
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);

// apply formula
        double q = Math.pow(Math.sin(dLatitude / 2), 2) +
                Math.pow(Math.sin(dLongitude / 2), 2) *
                        Math.cos(x1) *
                        Math.cos(x2);
        double r = 6371;
        double haversine = 2 * Math.asin(Math.sqrt(q));
        double distance = r * haversine;

        System.out.println(distance + " kilometers");

    }


}



