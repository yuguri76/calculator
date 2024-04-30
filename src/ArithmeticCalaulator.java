import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalaulator extends Calculator{

    private List<Double> results;

    public ArithmeticCalaulator() {
        this.results = new ArrayList<>();
    }

    public double calculate(double num1, double num2, char op) throws Exception {
        double result = 0.0;

        switch (op) {
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
                    throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
        }
        addResult(result); // 결과를 calculator 클래스의 results 리스트에 추가
        return result;
    }

    public void addResult(double result) {
        results.add(result);
    }

    public List<Double> Getter() {
        return new ArrayList<>(results);
    }

    public void Setter(List<Double> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    public void removeResult() {
        if(!results.isEmpty()) {
            results.remove(0);
        }
    }

    public void inquiryResults() {
        for (double res : results){
            System.out.println(res);
        }
    }
}
