public class DivideOperator implements Operator {

    @Override
    public double calculate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } else {
            return num1 / num2;
        }
    }
}
