import java.util.*;
import java.io.*;
import java.math.*;
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        int lastLandX = -1;
        int lastLandY = -1;
        int FlatY = -1;
        int startFlat = -1;
        int endFlat = -1;
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            if(landY == lastLandY){
                FlatY = landY;
                startFlat = lastLandX;
                endFlat = landX;
            }
            else{
                lastLandX = landX;
                lastLandY = landY;
            }
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int HS = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int VS = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int Fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int Angle = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int Power = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            // while over the flat area, reduce horozontal speed by tilting opposite movement

            int max_travel_HS = 60;
            int max_travel_angle = 20;

            if(X < startFlat) {
                if(HS < max_travel_HS)
                    System.out.println("-" + max_travel_angle + " 4");
                else
                    System.out.println(max_travel_angle + " 4");
            } else if (endFlat < X) {
                if(HS > (-1 * max_travel_HS))
                    System.out.println(max_travel_angle + " 4");
                else
                    System.out.println("-" + max_travel_angle + " 4");
            }else {
                int MAX_HS = 5;

                if (HS > MAX_HS)
                    System.out.print("50 ");
                else if (HS < (-1 * MAX_HS))
                    System.out.print("-50 ");
                else
                    System.out.print("0 ");

                if ((VS < -30) || (Math.abs(HS) > MAX_HS))
                    System.out.println("4");
                else
                    System.out.println("0");

            }
        }
    }
}
