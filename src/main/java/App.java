import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("첫번째 숫자 입력");
            int num1 = scanner.nextInt();

            System.out.println("두번째 숫자 입력");
            int num2 = scanner.nextInt();

            System.out.println("사칙연산 기호 입력 (+, -, *, /)");
            char operator = scanner.next().charAt(0);

            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
                calculator.addResultArr(num1, num2, operator);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("에러: " + e.getMessage());
                continue;
            }


            System.out.println("가장 먼저 계산된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
            scanner.nextLine();
            String remove = scanner.nextLine();
            if (remove.equals("remove")) {
                calculator.deleteFirstResultArr();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String getArr = scanner.nextLine();
            if (getArr.equals("inquiry")) {
                calculator.getResultArr();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String endCalc = scanner.nextLine();
            if (endCalc.equals("exit")) {
                break;
            }
        }
    }
}
