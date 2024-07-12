import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int result = 0;


        while (true) {
            System.out.println("첫번째 숫자 입력");
            num1 = scanner.nextInt();

            System.out.println("두번째 숫자 입력");
            num2 = scanner.nextInt();

            System.out.println("사칙연산 기호 입력 (+, -, *, /)");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("유효하지 않은 연산자입니다.");
                    continue;
            }

            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            scanner.nextLine();
            String endCalc = scanner.nextLine();

            if (endCalc.equals("exit")) {
                break;
            }
        }
    }
}
