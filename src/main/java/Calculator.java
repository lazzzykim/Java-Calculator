import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    Queue<Integer> resultArr = new LinkedList<>();
    int num1;
    int num2;
    char operator;
    int result = 0;

    public int calculate(int num1, int num2, char operator) {
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
                    System.out.println("throw exception");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("throw exception");
        }
        return result;
    }
}
