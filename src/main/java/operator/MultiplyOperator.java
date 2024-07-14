package operator;

public class MultiplyOperator implements Operator {

    @Override
    public double calculate(int num1, int num2) {
        return num1 * num2;
    }
}
