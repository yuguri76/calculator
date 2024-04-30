import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int result = 0;
        List<Integer> results = new ArrayList<>(); //Arraylist 사용 - 크기 동적으로 조정되고, 인덱스를 사용해서 요소에 접근이 쉬움. 그리고 끝에 요소 추가, 삭제에 유용

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");//버퍼에는 \n 저장
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");//버퍼에는 \n 저장
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");//버퍼에는 \n 저장
            char op = sc.next().charAt(0);

            sc.nextLine();//버퍼에 있는 \n 빼주기

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
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    break;
            }

            System.out.println("결과: " + result);
            results.add(result); //리스트에 결과 추가

            //System.out.println(results);  //배열 출력, 디버깅용

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            input = sc.nextLine();//엔터를 쳐도 넘어갈수 있게끔 nextLine으로 둠. nextLine은 버퍼에 있는 개행문자까지 모든 문자를 읽음.

            if (input.equals("remove")){
                    results.remove(0);
                    //System.out.println(results);  //배열 출력, 디버깅용
                }

        } while (!input.equals("exit"));//input이 exit와 동일해지기 전까지 무한반복
        sc.close();//스캐너 닫아주기
    }
}
