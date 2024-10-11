import java.util.Scanner;

//설명: 두 개의 숫자를 입력받아 그 숫자들의 최대공약수를 구하는 프로그램을 작성하세요.
public class Qeustion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력: ");
        int a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력: ");
        int b = sc.nextInt();

        //반복해서, 나머지가 0일 될 때 까지 계속 계산하면 a가 결국 두 숫자의 최대 공약수가 됨

        while(b!=0){
            int tmp = b;
            System.out.println("tmp = " + tmp);
            b = a % b;
            System.out.println("b = " + b);
            a = tmp;
            System.out.println("a = " + a);
        }

    }
}
