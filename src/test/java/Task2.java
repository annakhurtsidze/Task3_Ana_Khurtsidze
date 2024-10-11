import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of a cone:");
        float r = scanner.nextFloat();

        System.out.println("Enter height of a cone:");
        float h = scanner.nextFloat();

        System.out.println("Enter slant height of a cone");
        float s = scanner.nextFloat();

        scanner.close();

        System.out.println("Surface area of the cone is: " + surfaceArea(r, s));
        System.out.println("The volume of the cone is: " + volume(r, h));
    }
    public static float surfaceArea(float radius, float s){
       return (float) (Math.PI*radius*(radius+s));
    }

    public  static float volume(float radius, float height){
      return (float) ((Math.PI*Math.pow(radius, 2)*height)/3);
 }
}
