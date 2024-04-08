import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What day of the week do you want to khow?");
        String a = sc.nextLine();
        switch (a.toLowerCase(Locale.ROOT)){
            case "дуйшомбу":
                System.out.println("Monday"+Week.Monday);
                break;
            case "шейшемби":
                System.out.println("Tuesday"+Week.Tuesday);
                break;
                case "шаршемби":
                System.out.println("Wednesday"+Week.Wednesday);
                break;
                case "бейшемби":
                System.out.println("Thurday"+Week.Thurday);
                break;
                case "жума":
                System.out.println("Friday"+Week.Friday);
                break;
                case "ишемби":
                System.out.println("Saturday"+Week.Saturday);
                break;
                case "жекшемби":
                System.out.println("Sunday"+Week.Sunday);
                break;
            default:
                System.out.println("There is no such day of the week");
        }
    }
}