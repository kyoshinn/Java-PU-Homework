public class lover {
    public static void main(String[] args) {
        int floor = 9;

        while (floor!=0) {
            switch (floor) {
                case 8:
                    System.out.println("Здравей и сбогом, Мими <3");
                    break;
                case 7:
                    System.out.println("Здравей и сбогом, Пепи <3");
                    break;
                case 6:
                    System.out.println("Здравей и сбогом, Ваня <3");
                    break;
                case 5:
                    System.out.println("Здравей и сбогом, Сиси <3");
                    break;
                case 4:
                    System.out.println("Здравей и сбогом, Криси <3");
                    break;
                case 3:
                    System.out.println("Здравей и сбогом, Цвети <3");
                    break;
                case 2:
                    System.out.println("Здравей и сбогом, Стефи <3");
                    break;
                case 1:
                    System.out.println("Здравей и сбогом, Дани <3");
                    break;
            }
            floor--;
        }
        if (floor == 0) {
            System.out.println("Ауч");
        }
    }
}
