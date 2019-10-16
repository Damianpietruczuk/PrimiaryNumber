import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();
        if(IsPrimary.isPrimary(number)){
            System.out.println((int)number + " jest liczbą pierwszą");
        } else {
            System.out.println((int)number + " nie jest liczbą pierwszą");
        }
    }
}
