import java.util.Scanner;

public class Sounnd {

    public static void main(String[] args) {

        double distance, d2, d3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time passed between lightning and sound of it:");

        float time = input.nextFloat();

        distance = time * 335;

        String my_string = "Distance to the place of lightning strike is ";

        System.out.println("Distance to the place of lightning strike is " + distance + " meters ");
    }
}
