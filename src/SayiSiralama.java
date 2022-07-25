import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int say1,say2,say3;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Sayi: ");
        say1=sc.nextInt();
        System.out.println("2.Sayi: ");
        say2=sc.nextInt();
        System.out.println("3.Sayi: ");
        say3=sc.nextInt();

        if(say1>say2 && say1>say3){

             if(say2>say3 )
            {
                System.out.print("Buyukten kucuge siralama : " );
                System.out.print(say1+ " >");
                System.out.print(say2+ " >");
                System.out.print(say3);

            }

            else
             {
                 System.out.print("Buyukten kucuge siralama : " );
                 System.out.print(say1+ " >");
                 System.out.print(say3+ " >");
                 System.out.print(say2);
             }
        }
        else if(say2>say1 && say2>say3){

            if(say1>say3 )
            {
                System.out.print("Buyukten kucuge siralama : " );
                System.out.print(say2 + " >");
                System.out.print(say1+ " >");
                System.out.print(say3 );

            }

            else
            {
                System.out.print("Buyukten kucuge siralama : " );
                System.out.print(say2 + " >" );
                System.out.print(say3 + " >");
                System.out.print(say1 );
            }
        }
        else if(say3>say1 && say3>say2){

            if(say2>say3 )
            {
                System.out.print("Buyukten kucuge siralama : " );
                System.out.print(say3 + " >");
                System.out.print(say2 + " >");
                System.out.print(say1 );

            }

            else
            {
                System.out.print("Buyukten kucuge siralama : " );
                System.out.print(say3 + " >");
                System.out.print(say1 + " >");
                System.out.print(say2 );
            }
        }

    }
}
