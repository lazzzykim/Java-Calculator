package operator;

public class ModOperator implements Operator {
    @Override
    public double calculate(int num1, int num2) {
        return num1 % num2;
    }
}
