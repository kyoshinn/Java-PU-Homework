import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();

        if (month.equals("Януари")) {
            System.out.println("31 дни");
        } else if (month.equals("Февруари")) {
            System.out.println("29 дни");
        } else if (month.equals("Март")) {
            System.out.println("31 дни");
        } else if (month.equals("Април")) {
            System.out.println("30 дни");
        } else if (month.equals("Май")) {
            System.out.println("31 дни");
        } else if (month.equals("Юни")) {
            System.out.println("30 дни");
        } else if (month.equals("Юли")) {
            System.out.println("31 дни");
        } else if (month.equals("Август")) {
            System.out.println("30 дни");
        } else if (month.equals("Септември")) {
            System.out.println("31 дни");
        } else if (month.equals("Октомври")) {
            System.out.println("30 дни");
        } else if (month.equals("Ноември")) {
            System.out.println("31 дни");
        } else if (month.equals("Декември")) {
            System.out.println("30 дни");
        }
    }
}
