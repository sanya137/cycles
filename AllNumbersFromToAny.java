import java.util.Scanner;

public class AllNumbersFromToAny {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter from: ");
        int from = scanner.nextInt();
        System.out.println("Enter to: ");
        int to = scanner.nextInt();
        scanner.close();

        if (from <= to){
            for (int i = from; i <= to; i++){
                System.out.println(i);
            }
        }else {
            for (int n = from; n >= to; n--){
                System.out.println(n);
            }
        }
    }
}
