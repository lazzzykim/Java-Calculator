import java.util.Queue;

public abstract class Calculator {
    private final Queue<Double> resultArr;

    public Calculator(Queue<Double> result) {
        this.resultArr = result;
    }

    // 저장된 결과값 출력
    abstract void getResultArr();

    public Queue<Double> results() {
        return resultArr;
    }
    //가장 먼저 데이터에 저장된 값 삭제
    public void deleteFirstResultArr() {
        resultArr.poll();
    }
}
