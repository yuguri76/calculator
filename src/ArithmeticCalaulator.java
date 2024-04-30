import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalaulator extends Calculator {
    private List<Double> results;

    public ArithmeticCalaulator() {
        this.results = new ArrayList<>();
    }


    public double calculate(double num1, double num2, char op) throws Exception {//얘를 더 건들지 않는게 문제의 핵심
        double result = operatorFactory(op).operate(num1, num2);

        addResult(result); // 결과를 calculator 클래스의 results 리스트에 추가
        return result;
    }

    public Operator operatorFactory(char op) {//다형성
        switch (op) {
            case '+':
                return new AddOperator();
            case '-':
                return  new SubtractOperator();
            case '*':
                return new MultiplyOperator();
            case '/':
                return new DivideOperator();
            case '%' :
                return new ModOperator();
            default:
                throw new IllegalArgumentException("연산자가 아닙니다.");
        }
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
