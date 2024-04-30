import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalaulator arithmeticCalaulator = new ArithmeticCalaulator();
        CircleCalculator circleCalculator = new CircleCalculator();
        Scanner sc = new Scanner(System.in);
        String input = "";


        do {
            System.out.println("사칙연산을 진행할지(cal), 원의 넓이를 구할지(circle) 입력해주세요.");
            input = sc. nextLine();

            try {

                if(input.equals("cal")) { //사칙연산 구하기
                    System.out.print("첫 번째 숫자를 입력하세요: ");//버퍼에는 \n 저장
                    double num1 = sc.nextDouble();

                    System.out.print("두 번째 숫자를 입력하세요: ");//버퍼에는 \n 저장
                    double num2 = sc.nextDouble();

                    System.out.print("사칙연산 기호를 입력하세요: ");//버퍼에는 \n 저장
                    char op = sc.next().charAt(0);

                    sc.nextLine();//버퍼에 있는 \n 빼주기

                    double result = arithmeticCalaulator.calculate(num1, num2, op);

                    System.out.println("결과: " + result);

                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
                    input = sc.nextLine();
                    if (input.equals("remove")) {
                        arithmeticCalaulator.removeResult(); // remove 갖고와서 구현
                        //System.out.println(results);  //배열 출력, 디버깅용
                    }

                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    input = sc.nextLine();
                    if (input.equals("inquiry")) {
                        arithmeticCalaulator.inquiryResults(); // inquiry 갖고와서 구현
                    }


                } else if (input.equals("circle")) { //원넓이 구하기
                    System.out.println("원의 반지름을 입력하세요");
                    double radius = sc.nextDouble(); //원반지름 입력받기
                    sc.nextLine();//버퍼 비우기

                    double area = circleCalculator.calculateCircleArea(radius);
                    System.out.println("원의 넓이 : " + area);

                    circleCalculator.inquiryCircle();
                    //System.out.println(results);  //배열 출력, 디버깅용
                } else {
                    System.out.println("유효한 값을 입력해주세요"); //cal, circle 이외의 값이 들어왔을 때 예외처리
                    continue;
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = sc.nextLine();//엔터를 쳐도 넘어갈수 있게끔 nextLine으로 둠. nextLine은 버퍼에 있는 개행문자까지 모든 문자를 읽음.
            } catch (Exception e) {
                System.out.println("오류발생");
                sc.nextLine(); // 버퍼 비우기
            }

        } while (!input.equals("exit"));//input이 exit와 동일해지기 전까지 무한반복
        sc.close();//스캐너 닫아주기
    }
}
