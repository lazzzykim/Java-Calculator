import java.util.Queue;

public class ArithmeticCalculator extends Calculator {
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(Queue<Double> resultArr, AddOperator addOperator, SubtractOperator subtractOperator, MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(resultArr);
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    public double calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = addOperator.addition(num1, num2);
                break;
            case '-':
                result = subtractOperator.subtraction(num1, num2);
                break;
            case '*':
                result = multiplyOperator.multiplication(num1, num2);
                break;
            case '/':
                result = divideOperator.division(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다. [" + operator + "]");
        }
        return result;
    }

    @Override
    void getResultArr() {
        for (Double value : super.results()) {
            System.out.println(value);
        }
    }
}
