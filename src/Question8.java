// 1부터 100까지 더할때 홀수값들의 합
public class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i<=100){
            System.out.println(i);
            if(i % 2 != 0);{
                sum += i;
            }
            i++;
        }
        System.out.println("1부터 100까지의 홀수의 합은" + sum + "입니다");

    }
}
