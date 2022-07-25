import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String username, password, login;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı Adı:");
        username = sc.nextLine();
        System.out.print("Sifre:");
        password = sc.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgilerinizi Yanlış Girdiniz!");
            System.out.println("");
        }
    }
}
