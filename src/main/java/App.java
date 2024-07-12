import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firNum;
        int secondNum;
        int result;

        System.out.println("첫번째 숫자 입력");
        firNum = scanner.nextInt();

        System.out.println("사칙연산 기호 입력 (+, -, *, /");
        char operator = scanner.next().charAt(0);

        System.out.println("두번째 숫자 입력");
        secondNum = scanner.nextInt();
    }
}
