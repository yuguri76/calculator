import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int result = 0;
        int arr[] = new int[10]; // 크기 10인 int 배열 만들기
        int i = 0; //배열 인덱스

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

            //1-6파트
            if (i < arr.length) { //배열의 크기보다 작을 때 그대로 저장
                arr[i] = result;
                i++;
            } else { //배열의 크기보다 커졌을 때 왼쪽으로 하나씩 옮겨주면서 마지막에 저장.
                for (int j = 1; j < arr.length; j++)
                    arr[j - 1] = arr[j];
                arr[arr.length - 1] = result;
            }

            System.out.println(Arrays.toString(arr));  //배열 출력, 디버깅용

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            input = sc.nextLine();//엔터를 쳐도 넘어갈수 있게끔 nextLine으로 둠. nextLine은 버퍼에 있는 개행문자까지 모든 문자를 읽음.

        } while (!input.equals("exit"));//input이 exit와 동일해지기 전까지 무한반복
    }
}
