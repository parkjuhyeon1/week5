import java.util.Scanner;

//for 문을 사용하여 팩토리얼 프로그램
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int n = sc.nextInt();
        int result = 1;
        for(int i=1; i<=n; i++) {
            result *= i;
        System.out.println(result);

        }

    }
}
