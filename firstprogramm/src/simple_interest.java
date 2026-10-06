import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double principle = sc.nextDouble();
        System.out.print("Enter the rate of interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years : ");
        double time = sc.nextDouble();
        double simple_interest = (principle * rate * time) / 100;
        System.out.println("Simple Interest : " + simple_interest);
        sc.close();
    }
}
