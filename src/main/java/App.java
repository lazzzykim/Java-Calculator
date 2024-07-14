import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new LinkedList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new LinkedList<>());

        while (true) {
            System.out.println("원하는 계산의 번호를 입력하세요.");
            System.out.println("1. 사칙연산  / 2. 원의 넓이");
            int calculateType = scanner.nextInt();

            if (calculateType == 1) {
                System.out.println("사칙연산을 선택했습니다.");
                System.out.println("첫번째 숫자 입력");
                int num1 = scanner.nextInt();

                System.out.println("두번째 숫자 입력");
                int num2 = scanner.nextInt();

                System.out.println("사칙연산 기호 입력 (+, -, *, /)");
                char operator = scanner.next().charAt(0);

                try {
                    double result = arithmeticCalculator.calculate(num1, num2, operator);
                    System.out.println("결과: " + result);
                    arithmeticCalculator.results().add(arithmeticCalculator.calculate(num1, num2, operator));
                } catch (ArithmeticException | IllegalArgumentException e) {
                    System.out.println("에러: " + e.getMessage());
                    continue;
                }

                System.out.println("가장 먼저 계산된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                scanner.nextLine();
                String remove = scanner.nextLine();
                if (remove.equals("remove")) {
                    arithmeticCalculator.deleteFirstResultArr();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String getArr = scanner.nextLine();
                if (getArr.equals("inquiry")) {
                    arithmeticCalculator.getResultArr();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String endCalc = scanner.nextLine();
                if (endCalc.equals("exit")) {
                    break;
                }

            } else if (calculateType == 2) {
                System.out.println("원의 넓이를 선택했습니다.");
                System.out.println("원의 반지름을 입력하세요.");
                double radius = scanner.nextDouble();

                try {
                    double result = circleCalculator.circleArea(radius);
                    circleCalculator.results().add(circleCalculator.circleArea(radius));
                    System.out.println("결과: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("에러: " + e.getMessage());
                }

                System.out.println("가장 먼저 계산된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                scanner.nextLine();
                String remove = scanner.nextLine();
                if (remove.equals("remove")) {
                    circleCalculator.deleteFirstResultArr();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String getArr = scanner.nextLine();
                if (getArr.equals("inquiry")) {
                    circleCalculator.getResultArr();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String endCalc = scanner.nextLine();
                if (endCalc.equals("exit")) {
                    break;
                }
            }
        }
    }
}
