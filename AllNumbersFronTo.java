import java.util.Scanner;

public class AllNumbersFronTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter from: ");
        int from = scanner.nextInt();
        System.out.println("Enter to: ");
        int to = scanner.nextInt();
        scanner.close();

        for (int i = from; i<=to; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
