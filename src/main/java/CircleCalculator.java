import java.util.Queue;

public class CircleCalculator extends Calculator {


    public CircleCalculator(Queue<Double> result) {
        super(result);
    }

    public double circleArea(double radius) {
        if (radius < 0) {
            throw new ArithmeticException("반지름은 0보다 커야합니다.");
        } else {
            return Math.PI * radius * radius;
        }
    }

    @Override
    void getResultArr() {
        for (Double value : super.results()) {
            System.out.println(value);
        }
    }
}
