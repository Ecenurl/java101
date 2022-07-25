import java.util.Scanner;

public class SınıfGecmeHesabi {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya;
        double ort;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notu : ");
        matematik=sc.nextInt();
        System.out.print("Fizik notu: ");
        fizik= sc.nextInt();
        System.out.print("Turkce notu: ");
        turkce=sc.nextInt();
        System.out.print("Kimya notu: ");
        kimya= sc.nextInt();
        ort = (matematik+fizik+turkce+kimya)/4;

        if(ort<0 || ort>100){
            System.out.print("Ortalama hesaplanamadı....");
        }

        else{

            if(ort>55)
                System.out.print("Gectiniz");
            else
                System.out.print("Kaldiniz");
        }



    }
}
