import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {

    public static final double PI = 3.14; // 원주율 3.14는 변하면 안되기 때문에 static final 써야함.
    private List<Double> circleAreas = new ArrayList<>();

    public CircleCalculator() {
        super();
    }

    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        circleAreas.add(area);
        return area;
    }

    public List<Double> getCircle() {
        return new ArrayList<>(circleAreas);
    }

    public void inquiryCircle() {
        for (double area : circleAreas) {
            System.out.println(area);
        }
    }
    public void SetterCircle(List<Double> newCircleAreas) {
        this.circleAreas = new ArrayList<>(newCircleAreas);
    }

}
