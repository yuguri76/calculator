public class DivideOperator implements Operator{

    public double operate(double num1, double num2) throws Exception {
        if (num2 == 0) throw new Exception("0으로 나눌 수 없습니다.");
        return num1 / num2;
    }
}
