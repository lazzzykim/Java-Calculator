import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private final Queue<Integer> resultArr = new LinkedList<>();

    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    } else {
                        result = num1 / num2;
                        break;
                    }
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다. [" + operator + "]");
        }
        return result;
    }

    public Queue<Integer> addResultArr(int num1, int num2, char operator) {
        resultArr.add(calculate(num1, num2, operator));
        return resultArr;
    }

    // 저장된 결과값 출력
    public void getResultArr() {
        for (Integer value : resultArr) {
            System.out.println(value);
        }
    }

    //가장 먼저 데이터에 저장된 값 삭제
    public void deleteFirstResultArr() {
        resultArr.poll();
    }
}
