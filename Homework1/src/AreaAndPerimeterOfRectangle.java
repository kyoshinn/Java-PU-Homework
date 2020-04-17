import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Въведете а: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.print("Въвдете b: ");
        int b = Integer.parseInt(scan.nextLine());

        System.out.println("Лицето на правоъгълника е: " + areaRectangle(a,b));
        System.out.println("Периметъра на правоъгълника е: " + perimeterRectangle(a,b));
    }

    public static int areaRectangle(int a, int b) {
        int area = a*b;
        return area;
    }
    public static int perimeterRectangle(int a, int b) {
        int perimeter = 2*a + 2*b;
        return perimeter;
    }
}
