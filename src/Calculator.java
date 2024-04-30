import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Calculator {
    private List<Integer> results;

    public Calculator() {//생성자로 결과 저장할 리스트 초기화
        this.results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char op) throws Exception {
        int result = 0;

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
        results.add(result);
        return result;
    }

    public List<Integer> Getter() {
        return new ArrayList<>(results);
    }

    public void Setter(List<Integer> newResults) {
        this.results = newResults;
    }

    public void removeResult() {
        if(!results.isEmpty()) {
            results.remove(0);
        }
    }

    public void inquiryResults() {
        for (int res : results){
            System.out.println(res);
        }
    }

}
