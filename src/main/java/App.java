import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int result = 0;
        int[] resultArr = new int[10];
        int index = 0;


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
            // 배열에 저장하는 로직
            if (index < resultArr.length) {
                resultArr[index] = result;
                index++;
            } else {
                // 0번 인덱스를 날리고 왼쪽으로 밀어넣는 코드
                for (int i = 1; i < resultArr.length; i++) {
                    resultArr[i - 1] = resultArr[i];
                }
                // 9번 인덱스에 결과값을 저장해서 제일 마지막에 추가된 결과값이 됨
                resultArr[resultArr.length - 1] = result;
            }


            for (int i = 0; i < index; i++) {
                System.out.println((i + 1) + "번째 저장된 결과값: " + resultArr[i]);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            scanner.nextLine();
            String endCalc = scanner.nextLine();

            if (endCalc.equals("exit")) {
                break;
            }
        }
    }
}
