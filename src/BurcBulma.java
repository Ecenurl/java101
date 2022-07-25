import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.println("The month you were born : ");
        month = input.nextInt();

        System.out.println("The day you were born : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Capricorn");
                    } else {
                        System.out.println("Aquarius");
                    }
                } else {
                    System.out.println("You entered an invalid day ! ");
                }
                break;
            case 2:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Pisces");
                    } else {
                        System.out.println("Aries");
                    }
                } else {
                    System.out.println("You entered an invalid day ! ");
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Taurus");
                    } else {
                        System.out.println("Gemini");
                    }
                } else {
                    System.out.println("You entered an invalid day ! ");
                }
                break;
            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Cancer");
                    } else {
                        System.out.println("Leo");
                    }
                } else {
                    System.out.println("You entered an invalid day ! ");
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Virgo");
                    } else {
                        System.out.println("Libra");
                    }
                } else {
                    System.out.println("You entered an invalid day ! ");
                }
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Scorpio");
                    } else {
                        System.out.println("Sagittarius");
                    }
                } else {
                    System.out.println("You entered an invalid day ! ");
                }
                break;
            default:
                System.out.println("You entered an incorrect month !");

        }

        }
}
