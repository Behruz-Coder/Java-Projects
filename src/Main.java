import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();

        while (son > 0) {
            System.out.println(son);
            son--;
        }
    }
}
