import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Calculator {
    private List<Integer> results;
    private List<Double> circleAreas; //원넓이 저장리스트

    public static final double PI = 3.14; // 원주율 3.14는 변하면 안되기 때문에 static final 써야함.

    public Calculator() {//생성자로 결과 저장할 리스트 초기화
        this.results = new ArrayList<>();
        this.circleAreas = new ArrayList<>();
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

    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        circleAreas.add(area);
        return area;
    }

    public List<Double> GetterCircle() {
        return new ArrayList<>(circleAreas);
    }

    public void SetterCircle(List<Double> newCircleAreas) {
        this.circleAreas = new ArrayList<>(newCircleAreas);
    }

    public void inquiryCircle() {
        for (double area : circleAreas) {
            System.out.println(area);
        }
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
