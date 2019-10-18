import java.util.Scanner;

public class MainApp {

    public static void mainApp(){
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();
    if(IsPrimary.isPrimary(number)){
        System.out.println((int)number + " jest liczbą pierwszą");
    } else {
        System.out.println((int)number + " nie jest liczbą pierwszą");
    }
        System.out.println("Silnia liczby " + (int)number + " to: "+Factorial.factorial((int)number));
        mainApp();
    }
}
