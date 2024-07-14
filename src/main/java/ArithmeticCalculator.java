import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(Queue<Double> resultArr) {
        super(resultArr);
    }

    public Operator calculate(char operator) {
        return switch (operator) {
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator();
            default -> throw new IllegalArgumentException("잘못된 연산자입니다");
        };
    }

    public double getResult(int num1, int num2, char operator) {
        return calculate(operator).calculate(num1, num2);
    }

    @Override
    void getResultArr() {
        for (Double value : super.results()) {
            System.out.println(value);
        }
    }
}
